package com.company;
import java.util.ArrayList;

public class Customer<addAddress, getAccoutnID> {


    private ArrayList<ShippingAddress> Customer;
    private String name;
    private int customerID;

    public Customer(String customerName, int CustomerTaxID) {
        customerID = CustomerTaxID;
        this.name = customerName;
        Customer = new ArrayList<ShippingAddress>();
    }
    public void addAddress(ShippingAddress newAddress){
        Customer.add(newAddress);
    }
    public ShippingAddress openAccount(double initialDeposit) {
        var newAccount = new ShippingAddress();
        newAccount.deposit(initialDeposit);
        var didSucceed = Customer.add(newAccount);
        return newAccount;
    }

    public int getAccountID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        var custom = Customer.toString() + "\n" + name + "\n" + customerID;
        return custom;
    }

    public void closeAccount(int accountNum) {

    }


}



