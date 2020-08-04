package Structural.Package1.Bridge.Demo;

public class TPBank extends Bank{

    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Open your account at TPBank");
        account.openAccount();
    }
}
