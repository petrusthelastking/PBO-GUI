package Studikasus;

public class InternshipEmployee extends Employee {
    private int length;

    public InternshipEmployee(String name, int length){
        this.length = length;
        this.name = name;
    }
    public int getlength(){
        return length;
    }

    public void setlength(int length){
        this.length = length;
    }
    @Override
    public String getEmployeeiinfo(){
        String info = super.getEmployeeiinfo()+"\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
