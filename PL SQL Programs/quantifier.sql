/*
    Author:manan.panchal@stltech.in
*/

set serveroutput on

--outer PL/SQL block

begin <<outer>>
declare 
    v_outer number;
    v_a number := 100;
    
begin
    v_outer := 10;
    
    declare
        v_inner number := 20;
        v_a number := 200;
        
    begin
        
        dbms_output.put_line('Inner Block inner Var: ' || v_inner);
        dbms_output.put_line('Inner Block outer Var: ' || v_outer);
        dbms_output.put_line('Inner Block outer Var: ' || outer.v_a);
        dbms_output.put_line('Inner Block inner Var: ' || v_a);
    
    end;
    
    dbms_output.put_line('Outer Block: ' || v_outer);
    dbms_output.put_line('Outer Block outer Var: ' || v_a);

end;
end outer;