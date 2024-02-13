public class Person {
        private String name;
        private String address;
        private String phoneNumber;

    
        public Person(String name, String address, String phoneNumber){
            this.name=name;
            this.address=address;
            this.phoneNumber=phoneNumber;
    
        }

    public String getName(){
        return name;
      }

  
      public String getAddress(){
        return address;
      }
      
    public String getPhoneNumber(){
        return phoneNumber;
      }

      public void setName(String name){
        this.name=name;
    }


    public void setAddress(String add){
        this.address=add;
    }

    public void setPhoneNumber(String num){
        this.phoneNumber=num;
    }

    public String toString(){
        return this.name+" "+this.address+" "+this.phoneNumber;
    }
}
