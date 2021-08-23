create or replace procedure max_no (x in number, y in number, z out number)

as 

begin
    if x > y then
        z := x;
    else
        z := y;
    end if;
end;
/