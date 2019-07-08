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
public class PatientTest {
    public static void main(String[] args) {
    Person p = new Person("Abdi", 18);
    p.printDetails();
    Patient s = new Patient("Mohammed", 7, 97);
    s.age = 19;
    s.temperature = 100;
    s.printDetails();
    s.showSymbol();
}
    
}
