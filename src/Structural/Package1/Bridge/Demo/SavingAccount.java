package Structural.Package1.Bridge.Demo;

public class SavingAccount implements Account {

    @Override
    public void openAccount() {
        System.out.println("Saving account");
    }
}
