package com.company;

import java.util.ArrayList;
import java.util.zip.Adler32;

public class ShippingAddress {

        private String AddressLine1;

        private String AddressLine2;

        private String city;

        private String state;

        private String PostalCode;

        public ShippingAddress() {
                String[] programList = {"line1", "line2", "cityName", "stateName", "zipCode"};

                var finals = AddressLine1 + "\n" + AddressLine2 + "\n" + city + "\n" + state
                        + "\n" + PostalCode;

        }

        public void remove(ShippingAddress customer) {
        }

        public void deposit(double initialDeposit) {
        }

        public int getAccountID() {
        }
}