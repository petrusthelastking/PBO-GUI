package Studikasus;

import Studikasus.Employee.Payable;

public class Owner {
    public void pay(Payable p) {
        System.out.println("Total payment = " + p.getPaymentAmount());
        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(eb.getBillInfo());
        } else if (p instanceof PermanentEmployee) {
            PermanentEmployee pe = (PermanentEmployee) p;
            System.out.println(pe.getEmployeeiinfo());
            System.out.println("You have to pay her/him monthly!!!");
        }
    }

    public void showMyEmployee(Employee e) {
        System.out.println(e.getEmployeeiinfo());
        if (e instanceof PermanentEmployee) {
            System.out.println("You have to pay her/him monthly!!!");
        } else if (e instanceof InternshipEmployee) {
            System.out.println("No need to pay him/her :)");
        }
    }
}
