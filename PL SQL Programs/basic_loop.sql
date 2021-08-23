declare 
    v_counter NUMBER;

begin
    v_counter := 1;
    LOOP
        dbms_output.put_line('Counter: ' || v_counter);
        v_counter := v_counter + 1;
        exit when v_counter > 5;
    end loop;
end;