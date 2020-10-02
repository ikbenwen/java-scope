package nl.novi.javaprogrammeren.three;

public class Phone {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getInternationalPhoneNumber() {
        String internationalPhonenumber = "+31";

        return internationalPhonenumber + phoneNumber;
    }
}
