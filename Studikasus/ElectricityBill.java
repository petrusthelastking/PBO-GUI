package Studikasus;

import Studikasus.Employee.Payable;

public class ElectricityBill implements Payable {
    private int kWh;
    private String category;

    public ElectricityBill(int kWh, String category) {
        this.kWh = kWh;
        this.category = category;
    }

    public int getkWh() {
        return kWh;
    }

    public void setkWh(int kWh) {
        this.kWh = kWh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmount() {
        return kWh * getBasePrice();
    }

    public int getBasePrice() {
        int bPrice = 0;
        switch (category) {
            case "R-1":
                bPrice = 200;
                break;
            case "R-2":
                bPrice = 300;
                break;
            default:
                bPrice = 100;
                break;
        }
        return bPrice;
    }

    public String getBillInfo() {
        return "kWh = " + kWh + "\n" +
               "Category = " + category + " (" + getBasePrice() + " per kWh)\n";
    }
}
