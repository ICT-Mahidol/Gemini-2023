package HolidayTravelVehicles;
    public class Customer extends Person {
        private int customerId;
        private int membershipLevel;
        private Person firstName;
        private Person lastName;

        public Customer(){      
        }

        public Customer(String firstName, String lastName, int customerId, int membershipLevel){
            super();
            this.customerId = customerId;
            this.membershipLevel = membershipLevel;
        }

        public void setFirstName(Person firstName) {
            this.firstName = firstName;
        }

        public void setLastName(Person lastName) {
            this.lastName = lastName;
        }

        public int getCustomerId() {
            return customerId;
        }
        
        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public int getMembershipLevel() {
            return membershipLevel;
        }

        public void setMembershipLevel(int membershipLevel) {
            this.membershipLevel = membershipLevel;
        }

        public String getCustomerName() {
            return firstName + " " + lastName;
        }

        @Override
        public String toString() {
            return "Customer Name: " + getCustomerName() + "\nCustomer ID: " + customerId + "\nMembership Level: " + membershipLevel + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber();    
        }
    }