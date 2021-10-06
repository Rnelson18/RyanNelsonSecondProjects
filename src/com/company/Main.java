package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Optional;

//Ryan Nelson
public class Main {

    public static void main(String[] args) {
        var fileName = "Customer.txt";

    }
    private void addCustomer(Scanner menu) {

    }


    private ArrayList<Customer> Customer;
    private ArrayList<ShippingAddress> shippingAddresses;
    private ArrayList<Order> makeOrder;

    public Main() {
        makeOrder = new ArrayList<Order>();
        shippingAddresses = new ArrayList<ShippingAddress>();
        Customer = new ArrayList<Customer>();
    }

    public void RunStore() {
        var menu = new Scanner(System.in);
        while (true) {
            System.out.println(menu);
            var userChoices = menu.nextInt();
            switch (userChoices) {
                case 1:
                    System.exit(0);
                case 2:
                    addCustomer(menu);
                    break;
                case 3:
                    Optional<Customer> current = findCustomer(menu);
                    if (current.isPresent())
                        manageCustomer(menu, current.get());
            }
        }}

    private Optional<com.company.Customer> findCustomer(Scanner menu) {
        return null;
    }


    public void manageCustomer(Scanner menu, Customer newCustomer) {
            while (true) {
                System.out.println(menu);
                var customerChoice = menu.nextInt();
                switch (customerChoice) {
                    case 1:
                        System.exit(0);
                    case 2:
                        System.out.println("Enter the first address");
                        var line1 = menu.nextLine();
                        System.out.println("Enter the second address");
                        var line2 = menu.nextLine();
                        System.out.println("Enter the city");
                        var cityName= menu.nextLine();
                        System.out.println("Enter the state");
                        var stateName= menu.nextLine();
                        System.out.println("Enter the zipcode");
                        var zipCode = menu.nextLine();
                        var newShippingAddress = new ShippingAddress(line1,line2,cityName,stateName,zipCode);

                        newCustomer.addAddress(newShippingAddress);
                        break;
                }
                }

                }

                }





