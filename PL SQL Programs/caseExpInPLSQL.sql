set serveroutput on

declare
    v_grade char(1) := UPPER('&grade');
    v_appraisal varchar2(20);
    
begin
    v_appraisal := CASE v_grade
        WHEN 'A' THEN 'Excellent'
        WHEN 'B' THEN 'Very Good'
        WHEN 'C' THEN 'Good'
        ELSE 'No such grade'
    END;
    
    dbms_output.put_line('Grade: ' || v_grade);
    dbms_output.put_line('Appraisal: ' || v_appraisal);
end;