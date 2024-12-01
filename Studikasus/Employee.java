package Studikasus;

public class Employee {
    protected String name;
    public String getEmployeeiinfo(){
        return "name = " +name;
    }
    public interface Payable {
        public int getPaymentAmount();
        
    }
}
