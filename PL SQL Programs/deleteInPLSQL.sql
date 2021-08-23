declare
    
    v_product_id product1.id%type := 7603;

begin
    
    delete from product1
    where id = v_product_id;
    
   /* select price 
    into v_price_update
    from product1
    where id=v_pid;
    
    dbms_output.put_line('Product with id: ' || v_pid || ' updated with price: ' || v_price_update);
    */
end;
/* select * from product1; */