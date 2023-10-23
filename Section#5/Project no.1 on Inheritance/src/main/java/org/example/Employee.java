package org.example;

import java.util.Objects;

public class Employee extends Person{
    private String role ;
    private String department ;
    public Employee(String name , String address, String gender , String dateOfBirth , String role , String department){
        super(name , address , gender , dateOfBirth) ;
        this.role = role ;
        this.department = department ;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", department='" + department + '\'' +
                "} " +super.toString() ;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true ;
        }
        if(obj == null || this.getClass() != obj.getClass()){
            return false ;
        }
        Employee employee = (Employee) obj ;
        return Objects.equals(this.getName(), employee.getName()) && Objects.equals(this.getAddress(), employee.getAddress()) && Objects.equals(this.getGender(), employee.getGender()) && Objects.equals(this.getDateOfBirth(),employee.getDateOfBirth());
    }
    @Override
    protected Employee clone(){
        return new Employee(this.getName(), this.getAddress(), this.getGender(), this.getDateOfBirth(),role,department) ;
    }
}
