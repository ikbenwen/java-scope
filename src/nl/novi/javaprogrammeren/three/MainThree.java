package nl.novi.javaprogrammeren.three;

import org.w3c.dom.ls.LSOutput;

public class MainThree {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneNumber("612345678");

        System.out.println(phone.getInternationalPhoneNumber());
    }

}
