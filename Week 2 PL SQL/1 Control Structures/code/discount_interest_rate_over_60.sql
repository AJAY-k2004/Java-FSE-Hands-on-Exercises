DECLARE
  CURSOR cust_cursor IS
    SELECT CustomerID, InterestRate
    FROM Customers
    WHERE Age > 60;

BEGIN
  FOR cust IN cust_cursor LOOP
    UPDATE Customers
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = cust.CustomerID;
  END LOOP;

  COMMIT;
END;
