declare 
    a number;
    b number;
    c number;
    
begin
    a := 1000;
    b := 200;
    
    max_no(a,b,c);
    dbms_output.put_line('Maximum Number is : ' || c);

end;