package org.example;

public class Main {
    public static void main(String[] args) {
        Employee first_employee = new Employee("Khaled Ekramy" , "22 Mansoura City" , "Male" , "26 / 5 / 2004" , "Team Leader" , "Machine Learning Department" ) ;
        Employee second_employee = new Employee("Alkhwarizmy" , "22 Aga City" , "Male" , "23 / 6 / 2004" , "Senior" , "Deep Learning Department" ) ;
        if(first_employee.equals(second_employee)){
            System.out.println("First employee is the same second employee") ;
        }else{
            System.out.println("First employee is not the same as second employee") ;
        }
        Employee copy_of_first_employee = first_employee.clone() ;
        System.out.println(first_employee.toString()) ;
        System.out.println(second_employee.toString()) ;
        Student first_student = new Student("Osama Ben Laden", "123 Main St", "Male", "2000-01-01", 101, 10);
        Student second_student = new Student("Ashraf Ben Sharky", "456 Elm St", "Male", "2001-02-02", 102, 11);
        if(first_student.equals(second_student)){
            System.out.println("First Student is the same second employee") ;
        }else{
            System.out.println("First Student is not the same as second employee") ;
        }
        Student copy_of_first_student = first_student.clone() ;
        System.out.println(first_student.toString()) ;
        System.out.println(first_student.toString()) ;
    }
}
