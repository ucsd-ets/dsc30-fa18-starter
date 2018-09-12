/**
 * The Bank class acts as the interface between a user and their money.
 * The Bank consists of a ArrayList of accounts and a interest rate for savings accounts.
 * Through this class users can create accounts, deposit to accounts,
 * withdraw from accounts, and transfer between accounts.
 */
public class Bank {

    /**
     * Default constructor creates an empty accounts map and set initial interest rate to 0%
     */
    public Bank() {
        //TODO: implement
    }

    /**
     * Sets the savings interest rate
     *
     */
    public void setSavingsInterest(double rate) {
        //TODO: implement
    }

    /**
     * Returns the number of accounts this bank has
     *
     */
    public int getNumberOfAccounts() {
        //TODO: implement
        return 0;
    }

    /**
     * Gets the account associated with accountID
     *
     */
    private Account getAccount(String accountID) {
        String noAccountMessage = " DOES NOT HAVE AN ACCOUNT!";

        //TODO: implement

        return null;
    }

    /**
     * Creates a checking account with the given accountID and
     * returns true or false depending on success.
     *
     * The accountID must not already be taken and the initialDeposit must be greater than $0
     *
     */
    public boolean createCheckingAccount(String accountID, double initialDeposit) {
        String minimumMessage = "The minimum initial deposit for a checking account was not met!";

        //TODO: implement

        return false;
    }

    /**
     * Creates a savings account with the given accountID and
     * returns true or false depending on success.
     *
     * The accountID must not already be taken and the initialDeposit must be greater than $100
     *
     */
    public boolean createSavingsAccount(String accountID, double initialDeposit) {
        String minimumMessage = "The minimum initial deposit for a savings account was not met!";
        //TODO: implement
        return false;
    }

    /**
     * Adds money to the account associated with accountID
     *
     */
    public Double deposit(String accountID, double amount)  {
        //TODO: implement
        return 0.0;
    }

    /**
     * Removes money from the account associated with accountID
     *
     */
    public Double withdraw(String accountID, double amount) {
        //TODO: implement
        return 0.0;
    }

    /**
     * Moves money from an account to another account via "online" transfer.
     * No check fees are charged.
     *
     * If either account does not exist the transfer will fail.
     * If the fromAccount does not have enough funds or rejects the withdrawal for any other reason,
     * the transfer fails.
     *
     */
    public boolean onlineTransfer(String fromAccountID, String toAccountID, double amount) {
        //TODO: implement
        return false;
    }

    /**
     * Moves money from an account to another account using a "check."
     *
     * If either account does not exist the transfer will fail.
     * If the from account is not a checking account the transfer will fail.
     * If the fromAccount does not have enough funds or rejects the withdrawal for any other reason,
     * the transfer fails.
     *
     */
    public boolean checkTransfer(String fromAccountID, String toAccountID, double amount) {
        String notCheckingMessage = " IS NOT A CHECKING ACCOUNT!";
        //TODO: implement
        return false;
    }

    /**
     * Adds interest to every savings account.
     */
    public void addInterest() {
        //TODO: implement
    }

    /**
     * Prints the account information associated with accountID if an account exists.
     *
     */
    public void printAccount(String accountID) {
        //TODO: implement
    }

}
