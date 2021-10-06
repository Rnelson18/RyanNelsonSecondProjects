package com.company;


public class ShippingAddress {

        private String AddressLine1;

        private String AddressLine2;

        private String city;

        private String state;

        private String PostalCode;

        public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode) {
           AddressLine1 = line1;
           AddressLine1 = line2;
           city = cityName;
           state = stateName;
           PostalCode = zipCode;


        }

    public ShippingAddress() {

    }

    public String toString(){
                var finals = AddressLine1 + "\n" + AddressLine2 + "\n" + city + "\n" + state
                        + "\n" + PostalCode;
                return finals;
        }

        public void remove(ShippingAddress customer) {
        }

        public void deposit(double initialDeposit) {
        }

        public void getAccountID() {
        }

}