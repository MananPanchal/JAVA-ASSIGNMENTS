set serveroutput on
declare
    a number := 5;
    b number := NULL;
    
   -- a number := NULL;
   -- b number := NULL;
begin
    if a != b then
    --if a = b then
        dbms_output.put_line('a is not equal to b');
    else
        dbms_output.put_line('a is equal to b');        
    end if;
end;