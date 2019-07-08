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
public class Patient extends Person{
    int temperature;

    public Patient(String n, int a, int m) {
        super(n, a);
        temperature = m;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Temperature: " + temperature);
    }

    public void showSymbol() {
        char symbol;
        if (temperature >= 38) {
            symbol = 'W';        
        } else {
            symbol = 'G';
        }
        System.out.println("Condition: " + symbol);
    }
    
}
