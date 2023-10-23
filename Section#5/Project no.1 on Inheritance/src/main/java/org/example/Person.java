package org.example;

import java.util.Objects;

public class Person {
    private String name ;
    private String address ;
    private String gender ;
    private String dateOfBirth ;

    public Person(String name , String address, String gender , String dateOfBirth){
        this.name = name ;
        this.address = address ;
        this.gender = gender ;
        this.dateOfBirth = dateOfBirth ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(address, person.address) && Objects.equals(gender, person.gender) && Objects.equals(dateOfBirth, person.dateOfBirth);
    }
    @Override
    protected Person clone(){
        return new Person(name, address, gender, dateOfBirth) ;
    }

}
