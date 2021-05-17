create table if not exists sales
(
  sales_id serial not null,
  reference character varying(60),
  debit_reference character varying(255),
  amount numeric (9,2),
  created timestamp,

  constraint pk_sales primary key (sales_id)

);