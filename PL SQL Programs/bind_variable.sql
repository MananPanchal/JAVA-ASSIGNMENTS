
SET SERVEROUTPUT ON

--bind variable

variable v_name varchar2(30);

BEGIN
    /* Execution Code  */
    select first_name into :b_name 
    from employees where employee_id=100;
    dbms_output.put_line('First Name: ' || :b_name);

END;

/
print b_name