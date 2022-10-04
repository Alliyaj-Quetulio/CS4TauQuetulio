/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

import java.util.ArrayList;

/**
 *
 * @author TAU
 */
public class Student {
    String name;
    int age, friendship;
    double grade, money;
    Student bff;
    private static ArrayList<Student> studentList = new ArrayList();
    
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.friendship = 0;
        this.grade = 2.5;
        this.money = 500;
        studentList.add(this);
    }
   
    public void introduce() {
        // method 
        System.out.printf("Hi, my name is %s.%n", name);
    }
    public void study(int hours) {
        grade -= hours * 0.05;
    }
    public double getGrade() {
        return grade;
    }
    
    public void talk(Student other) {
        friendship += 1;
        other.friendship += 1;
    }
  
    public static Student getStudent(int index) {
        return studentList.get(index);
    }
    public static Student getStudent(String name) {
        for(Student s : studentList) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
}

