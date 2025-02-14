package Things;

public class BankInformation {
    public String accountHolderName;
    public long accountNumber;
    public void getBankInformation();

    public void getBankInformation(long accountNumber) {
        System.out.println("Account Number :" + accountNumber);
    }
    public void getbankInformation(String accountHolderName) {
        System.out.println("Account Holder Name :" + accountHolderName);
    }
    public void getBankInformation(long accountNumber,String accountHolderName) {
        System.out.println("Account Holder Name :" + accountHolderName);
        System.out.println("Account Number :" + accountNumber);

    }
}
