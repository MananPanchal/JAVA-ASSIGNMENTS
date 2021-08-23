set serveroutput on

declare
    v_weekday varchar2(20) := LOWER('&day');
    
begin
    CASE v_weekday
        WHEN 'monday' THEN
            dbms_output.put_line('Meeting with Team');
        WHEN 'tuesday' THEN
            dbms_output.put_line('Call to Client');
        WHEN 'wednesday' THEN
            dbms_output.put_line('Conference call with Sales');
        ELSE
            dbms_output.put_line('Sorry! Invalid Choice!!');
    END CASE;
end;