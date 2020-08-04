package Structural.Package4.Decorator;

import java.util.Date;

public class TeamLeader extends EmployeeDecorator{
    protected TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        monitor();
        motivate();
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " is motivating his members.");
    }

    public void monitor() {
        System.out.println(this.employee.getName() + " is monitoring his members.");
    }
}
