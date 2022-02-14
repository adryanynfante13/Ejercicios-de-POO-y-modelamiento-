package planetarysystem;

/******************************************************
 *  @author:    Adryan Ynfante 2022
 *  @version:   1.0 
 *  File:       main.java
 *  Created:    13/02/2022
 *  Project:    planetarysystem
 *  Comments:   Sofka Java
 *******************************************************/
public class Main {

    public static void main(String[] args) {
        System.out.println("******************************************************");
        System.out.println(" Welcome to the planetary calculation system by Adryan ");
        System.out.println("******************************************************");
        System.out.println("");
        
        System.out.println("Enter Planet 1: ");
        Planet planet1 = new Planet();
        planet1.getSystemSolar();
        System.out.println("................................................");
        System.out.println("Enter Planet 2: ");
        Planet planet2 = new Planet();
        planet2.getSystemSolar();

        Calculation calculation = new Calculation();
        Double distPlanets = calculation.calculateDistPlanets(planet1, planet2);
        System.out.println("");
        Double gravitational = calculation.calculateDistPlanets(planet1, planet2);
        System.out.println("The distance between the planet " + planet1.getName() + " and the planet " + planet2.getName() + " is: " + distPlanets + "m");
        System.out.println("The gravitational force between the planet " + planet1.getName() + " and the planet " + planet2.getName() + " is: " + gravitational + " Nm^2/kg^2");

    }
}
