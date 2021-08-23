declare 
    a number;
    b number;
    
begin
    a := 1000;
    b := 200;
    
    max_no_inout(a,b);
    dbms_output.put_line('Maximum Number is : ' || b);

end;