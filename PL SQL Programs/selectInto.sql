set serveroutput on

DECLARE
    v_emp_id number;
    v_first_name varchar2(20);
    v_sal number(8,2);
    v_dept_no number(4,0);
    
BEGIN
    select employee_id, first_name, salary, department_id 
    into v_emp_id, v_first_name, v_sal, v_dept_no
    from employees
    where employee_id=200;
    
    dbms_output.put_line('Employee id: ' || v_emp_id);
    dbms_output.put_line('First Name: ' || v_first_name);
    dbms_output.put_line('Salary :' || v_sal);
    dbms_output.put_line('Department id: ' || v_dept_no);
    
end;