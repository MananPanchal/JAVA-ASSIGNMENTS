
begin
    for v_counter in 1..5 LOOP
        dbms_output.put_line('Counter: ' || v_counter);
    end loop;
    dbms_output.put_line('');
    for v_counter in reverse 1..5 LOOP
        dbms_output.put_line('Counter: ' || v_counter);
    end loop;
end;