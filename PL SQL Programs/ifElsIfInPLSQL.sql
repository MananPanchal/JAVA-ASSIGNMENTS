set serveroutput on

declare
    v_child_age number(2,1) := &age;
    
begin
    if v_child_age >= 3 and v_child_age < 4 then
        dbms_output.put_line('Admission to Nursery');
    elsif v_child_age >= 4 and v_child_age < 5 then
        dbms_output.put_line('Admission to Jr. KG');
    elsif v_child_age >= 5 and v_child_age < 6 then
        dbms_output.put_line('Admission to Sr. KG');
    else
        dbms_output.put_line('Sorry! No Admission!!');
    end if;
end;