create table if not exists sales_items
(
  sales_item_id serial not null,
  sales_id  bigint not null,
  book_id bigint not null,
  price numeric (9,2),


  constraint pk_sales_items primary key (sales_item_id),
  constraint fk_sales_items_sales_id foreign key (sales_id)
      references sales (sales_id) match simple
      on update no action on delete no action

);