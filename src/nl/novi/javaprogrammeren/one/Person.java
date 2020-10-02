package nl.novi.javaprogrammeren.one;

public class Person {

    public void ageOneYear() {
        this.age++;
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
