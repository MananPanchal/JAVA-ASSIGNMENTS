DECLARE 
    v_tourist_loc VARCHAR2(20) := q'!Nature's Place!';
    v_event_day VARCHAR2(20) := q'[Mother's Day]';
    
BEGIN
    dbms_output.put_line('Tourist Location: ' || v_tourist_loc);
    dbms_output.put_line('Which Day at tour: ' || v_event_day);
END;