

CREATE OR REPLACE PROCEDURE TransferFunds(
    source_acc_id IN NUMBER,
    dest_acc_id IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_balance EXCEPTION;
BEGIN
 
    DECLARE
        current_balance NUMBER;
    BEGIN
        SELECT balance INTO current_balance
        FROM accounts
        WHERE account_id = source_acc_id;

        IF current_balance < amount THEN
            RAISE insufficient_balance;
        END IF;
    END;

   
    UPDATE accounts
    SET balance = balance - amount
    WHERE account_id = source_acc_id;

   
    UPDATE accounts
    SET balance = balance + amount
    WHERE account_id = dest_acc_id;

    COMMIT;
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in source account.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
        ROLLBACK;
END;
/
