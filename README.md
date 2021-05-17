# bookmanagement
a springboot api used to manage books

## Compiling the project

The project was done using Java, Spring boot, flyway, Maven and Postgres DB. To start you have to change the file ```\bookmanagement\src\main\resources\application.properties```
file to point to the correct database.
When the database parameters are set you can execute the following command, ```mvn spring-boot:run```. This command will run the database
migration scripts and it will start running the project.

## Database Migration and Seeding

The project was done using Flyway, I have the DDLs for creating the tables in the  folder ```bookmanagement\src\main\resources\db\migration\```.

## Using the application
The following end points are accessible for the project. This assumes that the application is running on localhost on port 8080.

* http://localhost:8080/api/books - This shows a list of all books created and it uses GET method.
* http://localhost:8080/api/books/1 - This shows a list of all books that belongs to a certain category and it uses POST method.
* http://localhost:8080/api/addcategory - This is used to create a new category in the database,a request body with categoryName and POST method are used.
* http://localhost:8080/api/addbook - This point is used to create a new book in the database and has a requst body with following fields title,description,price,categoryId 
.POST method for example.
``{
    "title":"batman",
    "description":"hero",
    "price":"40.55",
    "categoryId":{
        "categoryId":2
    }
}
``
* http://localhost:8080/api/payment - This point is used to make payments for a list of books,uses POST method and it has a request body for example.

`` {
  "amount" : 123.33,
  "created" : "2021-05-13T11:44:47.873+02:00",
  "card" : {
    "id" : "1234560000000001",
    "expiry" : "2020-01-01"
  },
  "reference" : "bookstore34",
  "additionalData" : {
    "SampleKey" : "This is a sample value"
  },
  "salesItemsList": [
      {"bookId": 5, "price": 20.00},
      {"bookId": 6, "price": 103.33}
  ]
}
``



