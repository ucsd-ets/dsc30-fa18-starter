/**
 * The SavingsAccount class extends Account.
 * The minimum amount a customer can keep in a savings account is $100.
 * If the customer deposits at least $5000 initially the bank gives them an additional $250 bonus
 * This account earns interest at a rate specified by the bank.
 * It allows deposits with no fees.
 * Withdrawals are charged $2 per withdrawal.
 * The balance cannot go below $100 through a withdrawal.
 *
 * Refer to the writeup for a more detailed description!
 */
public class SavingsAccount extends Account {

    public SavingsAccount(String userid, double initialDeposit) throws InsufficientFundsException {
        //TODO: Implement
    }

    public double deposit(double amount) {
        //TODO: Implement
        return 0;
    }

    public double withdraw(double amount) throws InsufficientFundsException {
        double maxPossibleWithdrawal = 0; // need to set this to proper value
        String exceptionMSG = "THE MAXIMUM AMOUNT THE USER: (" + id + ") CAN "
                              + "WITHDRAW FROM THEIR SAVINGS ACCOUNT "
                              + "IS ($" + maxPossibleWithdrawal + ")";

        //TODO: Implement

        return 0;
    }

    public double addInterest(double rate) {
        //TODO: Implement
        return 0;
    }
}
