create table if not exists category
(
  category_id serial not null,
  category_name character varying(255),
  constraint pk_category primary key (category_id)
);