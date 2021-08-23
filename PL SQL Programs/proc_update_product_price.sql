CREATE OR REPLACE PROCEDURE update_product_price (p_id product1.id%type, p_price product1.price%type)

AS

BEGIN
    update product1
    set price = price + p_price
    where id = p_id;

END;
/