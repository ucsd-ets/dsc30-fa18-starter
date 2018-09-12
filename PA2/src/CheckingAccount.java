/**
 * The CheckingAccount class extends Account.
 * This account does not give any interest.
 * It allows deposit and withdrawals with no fees.
 * The balance cannot go below $0 through a withdrawal.
 *
 * A checking account also allows the users to use checks may be used to make withdrawals.
 * The first three check uses in a month are free,
 * but subsequent uses add a fee of $2 to each check withdrawal.
 * Checks are allowed to take the balance negative (i.e., an overdraft).
 * If the balance goes negative the user incurs an overdraft fee of $35.
 * If the balance is negative we do not allow any additional
 *     withdrawals until enough money is deposited to cover the fee.
 *
 * Refer to the writeup for a more detailed description!
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String id, double initialDeposit) throws InsufficientFundsException {
        //TODO: implement
    }

    public void resetChecksUsed() {
        //TODO: implement
    }

    public int getChecksUsed() {
        //TODO: implement
        return 0;
    }

    public double deposit(double amount) {
        //TODO: implement
        return 0;
    }

    public double withdraw(double amount) throws InsufficientFundsException {
        double requiredDeposit = 0; // need to set this to proper value
        double maxPossibleWithdrawal = 0; // need to set this to proper value
        String overdraftRejection = "USER: (" + id + ") CANNOT MAKE A WITHDRAWAL FROM THEIR CHECKING ACCOUNT " +
                "UNTIL THEY COVER THEIR OVERDRAFT FEE " +
                "WITH A DEPOSIT OF AT LEAST ($" + requiredDeposit + ")";
        String exceptionMSG =
                "THE MAXIMUM AMOUNT THE USER: (" + id + ") CAN WITHDRAW FROM THEIR CHECKING ACCOUNT IS " +
                "($" + maxPossibleWithdrawal + ")";

        //TODO: implement

        return 0;
    }

    public double withdrawUsingCheck(double amount) throws InsufficientFundsException {
        double requiredDeposit = 0; // need to set this to proper value
        String overdraftRejection = "USER: (" + id + ") CANNOT MAKE A WITHDRAWAL FROM THEIR CHECKING ACCOUNT " +
            "UNTIL THEY COVER THEIR OVERDRAFT FEE " +
            "WITH A DEPOSIT OF AT LEAST ($" + requiredDeposit + ")";

        //TODO: implement

        return 0;
    }
}
