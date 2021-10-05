package com.company;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.nio.file.Files;

public class Customer<addAddress> {


    private ArrayList<ShippingAddress> Customer;
    private String name;
    private int customerID;

    public Customer(String customerName, int CustomerTaxID){
        customerID = CustomerTaxID;
        this.name = customerName;
        Customer = new ArrayList<ShippingAddress>();
    }

    public ShippingAddress openAccount(double initialDeposit){
        var newAccount = new ShippingAddress();
        newAccount.deposit(initialDeposit);
        var didSucceed = Customer.add(newAccount);
        return newAccount;
    }
    public Optional<ShippingAddress> classAccount(int accountNumber){
        for(var Customer: Customer){
            if (Customer.getAccountID() == accountNumber){
                System.out.println("Removing account with account ID" + accountNumber + " from  Customer " + name);
                Customer.remove(Customer);
                return Optional.of(Customer);

            }
        }
        System.out.println("Account with account Number" + accountNumber + " is not " + name+ "s account");
        return Optional.empty();
    }

    public int getCustomerID(){
        return customerID;
    }
    public String getName(){
        return name;
    }

    public Optional<ShippingAddress> closeAccount(int accountNum) {

    }
}
