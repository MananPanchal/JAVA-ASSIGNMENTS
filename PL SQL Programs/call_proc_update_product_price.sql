/* select * from product1; */

/* exec update_product_price(7603, 11000); */

set SERVEROUTPUT ON

declare
    v_id product1.id%type := &product_id;
    v_price product1.price%type := &product_price;

begin
    update_product_price(v_id, v_price);

end;

