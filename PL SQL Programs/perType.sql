set serveroutput on

DECLARE
    v_sal employees.salary%TYPE;
    v_empno employees.employee_id%TYPE NOT NULL := 11234;
    v_location locations.city%TYPE := 'New York';
    v_hireddate employees.hire_date%TYPE;
    c_commission CONSTANT employees.commission_pct%TYPE := 0.8;
    
BEGIN
    
    dbms_output.put_line('Salary: ' || v_sal);
    dbms_output.put_line('Emp No: ' || v_empno);
    dbms_output.put_line('Location: ' || v_location);
    dbms_output.put_line('Hire Date: ' || v_hireddate);
    dbms_output.put_line('Commission: ' || c_commission);

END;