/*
    Author:manan.panchal@stltech.in
*/

set serveroutput on

--outer PL/SQL block

declare
    v_outer number;
    
begin
    v_outer := 10;
    
    declare
        v_inner number := 20;
        
    begin
        
        dbms_output.put_line('Inner Block inner Var: ' || v_inner);
        dbms_output.put_line('Inner Block outer Var: ' || v_outer);
    
    end;
    
    dbms_output.put_line('Outer Block: ' || v_outer);
        
end;