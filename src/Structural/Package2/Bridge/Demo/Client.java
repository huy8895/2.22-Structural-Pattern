package Structural.Package2.Bridge.Demo;

public class Client {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new SavingAccount());
        vietcomBank.openAccount();
    }
}
