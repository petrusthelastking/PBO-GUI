package Studikasus;

// Pastikan interface Payable dan kelas Employee sudah ada.
import Studikasus.Employee.Payable;

public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary); // Bonus 5% dari gaji
    }

    @Override
    public String getEmployeeiinfo() {
        // Gunakan metode dari kelas induk dan tambahkan informasi spesifik
        String info = super.getEmployeeiinfo() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info; // Pastikan info dikembalikan
    }
}
