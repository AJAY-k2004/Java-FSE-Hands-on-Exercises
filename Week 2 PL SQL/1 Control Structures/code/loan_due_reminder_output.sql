DECLARE
  CURSOR loan_cursor IS
    SELECT CustomerID, LoanID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
  FOR loan IN loan_cursor LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan.LoanID || ' for Customer ' || loan.CustomerID || ' is due on ' || TO_CHAR(loan.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
