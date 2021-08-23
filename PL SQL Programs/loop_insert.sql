set serveroutput on;

declare
    v_max_id product1.id%type;
    v_counter number(4);
    v_num_rows number(4);
    v_name product1.name%type := '&product_name';
    v_brand product1.brand%type;
    v_price product1.price%type;

begin
    select max(id) into v_max_id from product1;
    select count(*) into v_num_rows from product1 where name = v_name;
    
    if v_num_rows < 3 then
        v_counter := 1;
        loop
            v_brand := '&brand';
            v_price := '&price';
            insert into product1 (id, name, brand, price) values (v_max_id + v_counter, v_name, v_brand, v_price) ;
            v_counter := v_counter + 1;
            exit when v_counter > 2;
        end loop;
        dbms_output.put_line((v_counter-1) || 'New product records of name ' || v_name || ' inserted..');
    else    
        dbms_output.put_line('Not Elligible to insert new product records!');
    end if;
end;


/* select * from product1; */