
create table if not exists book
(
  book_id serial not null,
  title character varying(60),
  description character varying(255),
  category_id bigint not null,
  price numeric (9,2),
  constraint pk_book primary key (book_id),
  constraint fk_book_category_id foreign key (category_id)
      references category (category_id) match simple
      on update no action on delete no action
);