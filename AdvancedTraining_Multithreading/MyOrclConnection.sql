create table product1
(

    id number(4) primary key,
    name varchar2(30),
    brand varchar2(20),
    price number(12,2)

);

desc product1;


insert into product1 (id, name, brand, price) VALUES (3001, 'Refrigerator', 'Whirlpool', 35000.00);

insert into product1 (id, name, price) VALUES (3002, 'Laptop', 29500.00);

insert into product1 VALUES (3003, NULL, 'Laptop', 29500.00);

insert into product1 (id, name, brand, price) values (&pid, '&pname', '&pbrand', &price);

select * from product1;


create table shop_product1
(

    id number(4) primary key,
    name varchar2(30),
    brand varchar2(20),
    price number(12,2)

);

insert into shop_product1 select * from product1;

select * from shop_product1;


update product1 set brand = 'Sony', price = price + 2000.00 where id = 3003;

update shop_product1 set brand = 'Sony', price = 56000.00;


delete FROM shop_product1 where id=3004;

delete from shop_product1;


rollback;


commit;



select * from shop_product1;
update shop_product1 set brand = 'Sony', price = 60000.00 where id = 3004;
savepoint A;

delete FROM shop_product1 where id=3004;
SAVEPOINT B;

delete from shop_product1;

ROLLBACK to B;

ROLLBACK to A;

ROLLBACK;
