package myPackage;

public class Person {

    private String name;
    private String lastname;

    public Person(String name, String surname) {
        this.name = name;
        this.lastname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
