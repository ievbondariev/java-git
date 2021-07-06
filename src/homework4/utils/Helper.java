package homework4.utils;


import homework4.exceptions.UserExpectedError;
import homework4.exceptions.WrongFieldException;
import homework4.exceptions.WrongSumException;

public class Helper {

    public void checkAccountLength(String account) throws WrongFieldException {
        if (account.length() != 10) {
            throw new WrongFieldException("Account length must be 10.");
        }
    }

    public void checkAmount(double amount) throws WrongSumException {
        if (amount > 1000) {
            throw new WrongSumException("Transfer limit is 1000.");
        }
    }

    public void checkAccount(String sendersAccount, String recipientsAccount) {
        if (sendersAccount.equals(recipientsAccount)) {
            throw new UserExpectedError("Sender and recipient must be different.");
        }
    }
}
