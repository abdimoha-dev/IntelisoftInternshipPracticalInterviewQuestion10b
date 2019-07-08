/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Abdi Mohammed
 */
public class Person {

    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }  
}
