package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Optional;

//Ryan Nelson
public class Main {

    public static void main(String[] args) {
        var fileName = "Customer.txt";

    }
    private void addCustomer(Scanner menu) {

    }

    private ArrayList<ShippingAddress> Customer;
    private ArrayList<Order> makeOrder;

    public Main() {
        makeOrder = new ArrayList<Order>();
        Customer= new ArrayList<ShippingAddress>();
    }


    public void RunStore() {
        var menu = new Scanner(System.in);
        while(true) {
            System.out.println(menu);
            var userChoices = menu.nextInt();
            switch (userChoices) {
                case 1:
                    System.exit(0);
                case 2:
                    addCustomer(menu);
                    break;
                case 3:
                    Optional<Customer> current = selectCustomer(menu);
                    if (current.isPresent())
                        manageCustomer(menu, current.get());
            }

            public void manageCustomer() {
                while (true) {
                    System.out.println(menu);
                    var customerChoice = menu.nextInt();
                    switch (customerChoice) {
                        case 1:
                            System.exit(0);
                        case 2:
                            addAddress(menu);
                            break;


                    }

                    }
                }


                }
    }