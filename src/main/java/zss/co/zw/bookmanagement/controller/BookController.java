package zss.co.zw.bookmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import zss.co.zw.bookmanagement.model.*;
import zss.co.zw.bookmanagement.repository.BookRepository;
import zss.co.zw.bookmanagement.repository.SalesItemsRepository;
import zss.co.zw.bookmanagement.repository.SalesRepository;


import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    BookRepository bookRepository;
    @Autowired
    SalesRepository salesRepository;
    @Autowired
    SalesItemsRepository salesItemsRepository;

    @CrossOrigin
    @RequestMapping(value = "/addbook", method = RequestMethod.POST)
    public String bkadd(@RequestBody Book bk) {
        Book b = new Book();
        b.setTitle(bk.getTitle());
        b.setDescription(bk.getDescription());
        b.setPrice(bk.getPrice());
        b.setCategoryId(bk.getCategoryId());

        bookRepository.save(b);
        return ("book saved");
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @RequestMapping(value = "/books/{category}", method = RequestMethod.POST)
    public Object findByCategory(@PathVariable Integer category) {
        return bookRepository.findAllByCategoryId(category);
    }

    @RequestMapping(value = "/template", method = RequestMethod.POST,consumes = "application/json",produces = "application/json" )

    public Response  createPayment(@RequestBody Sales sales) {

        System.out.println();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + "9ca3d5ed-dc04-4700-8dd6-7d60c3cdf0fa");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        Transaction transaction = new Transaction();
        transaction.setAmount(sales.getAmount());
        transaction.setReference(sales.getReference());
        transaction.setCard(sales.getCard());
        transaction.setCreated(sales.getCreated());
        transaction.setType("PURCHASE");
        transaction.setExtendedType("NONE");
        transaction.setNarration("Paying for books");
        transaction.setAdditionalData(sales.getAdditionalData());

        HttpEntity<Transaction> entity = new HttpEntity<Transaction>(transaction, headers);

        System.out.println(sales.toString());

        Response resp = restTemplate.exchange(
                "https://secure.v.co.zw/interview/api/transaction", HttpMethod.POST, entity, Response.class).getBody();

       //if Response.class.getre

        if (resp.getResponseCode().equals("000")){

            Sales sold = new Sales();
            sold.setAmount(sales.getAmount());
            sold.setCreated(sales.getCreated());
            sold.setDebitReference(resp.getDebitReference());
            sold.setReference(sales.getReference());
            Sales s = salesRepository.save(sold);

            SalesItems item = new SalesItems();

            for (int i = 0; i < sales.getSalesItemsList().size(); i++) {
                SalesItems salesItems = sales.getSalesItemsList().get(i);
                salesItems.setSalesId(s);
                salesItemsRepository.save(salesItems);
            }
        }
        return resp;
    }



}
