package Structural.Package2.Bridge.Demo;

public class VietcomBank extends Bank {

    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at VietcomBank");
        account.openAccount();
    }
}
