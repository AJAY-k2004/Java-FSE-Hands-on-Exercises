DECLARE
  CURSOR vip_cursor IS
    SELECT CustomerID, Balance
    FROM Customers
    WHERE Balance > 10000;

BEGIN
  FOR vip IN vip_cursor LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = vip.CustomerID;
  END LOOP;

  COMMIT;
END;
