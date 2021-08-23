create or replace procedure max_no_inout (x in number, y in out number)

as

begin
    if x > y then
        y := x;
    else
        y := y;
    end if;

end;
/