package org.example;

import java.util.Objects;

public class Student extends Person{
    private int ID ;
    private int classNumber ;
    public Student(String name , String address, String gender , String dateOfBirth , int ID , int classNumber){
        super(name, address, gender, dateOfBirth) ;
        this.ID = ID ;
        this.classNumber = classNumber ;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", classNumber=" + classNumber +
                "} " + super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(this.getName(), student.getName()) && Objects.equals(this.getAddress(), student.getAddress()) && Objects.equals(this.getGender(), student.getGender()) && Objects.equals(this.getDateOfBirth(),student.getDateOfBirth());

    }
    @Override
    protected Student clone(){
        return new Student(getName() , getAddress() , getGender() , getDateOfBirth() , ID , classNumber) ;
    }

}
