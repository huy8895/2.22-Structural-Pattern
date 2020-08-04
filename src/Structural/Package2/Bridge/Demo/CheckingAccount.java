package Structural.Package2.Bridge.Demo;

public class CheckingAccount implements Account {

    @Override
    public void openAccount() {
        System.out.println("Checking account");
    }
}
