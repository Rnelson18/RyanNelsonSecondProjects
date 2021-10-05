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
    }


    public void manageCustomer(Scanner menu, Customer newCustomer) {
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
                private void customerMenu() {
                    System.out.println("======================================");
                    System.out.println("What do you want to do with this Customer?");
                    System.out.println("     [1] Enter Name");
                    System.out.println("     [2] Enter Customer IDt");
                    System.out.println("     [3] Return to Main menu");
                    System.out.println("======================================");
                    System.out.println(" Enter choice: ");
                } private Optional<Customer> selectCustomer(Scanner){
                    System.out.println("Customer Id of customer to select: ");
                Random reader;
                var idfind = reader.nextInt();{
                    for (var currentCustomer : allCustomers) 
                        if (currentCustomer.getCustomerID() == idfind)
                            return Optional.of(newCustomer);
                    }
                    return Optional.empty();
                }
                private void addCustomer(Scanner menu) {

                }
                private void printMenu(){
                    System.out.println("===================================================");
                    System.out.println("what would you like to do next (select the number):");
                    System.out.println("     [1] Exit the program");
                    System.out.println("     [2] Add a customer");
                    System.out.println("     [3] Select customer by ID");
                    System.out.println("     [4] Enter the product");
                    System.out.println("===================================================");
                    System.out.println("Enter choice:");

                }

            }
        }


