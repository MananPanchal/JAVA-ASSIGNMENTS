set serveroutput on

declare 
    v_voter_age number := &person_age;
    
begin

    if v_voter_age >= 18 then
        dbms_output.put_line('Eligible for voting!');
    else
        dbms_output.put_line('Not Eligible for voting!');
    end if;
    
end;