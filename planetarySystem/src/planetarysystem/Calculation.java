/*
**@adryan 
 */
package planetarysystem;

import java.util.Scanner;

public class Calculation {

    private Double distPlanets;
    private Double G = 6.67E-11;

    public Calculation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the angle between the two planets with respect to the sun, remember that it must be from 0 to 360: ");
        this.distPlanets = in.nextDouble();
    }

    //calculo para distancia entre los planetas
    public Double calculateDistPlanets(Planet planet1, Planet planet2) {
        Double distPlanets = Math.sqrt(Math.pow(planet1.getDistanceSun(), 2) + Math.pow(planet2.getDistanceSun(), 2) - 2 * (planet1.getDistanceSun() * planet2.getDistanceSun()) * Math.cos(this.distPlanets));
        return distPlanets;
    }

   //calculo para fuerza gravitacional
    public Double calculateGravitational(Planet planet1, Planet planet2, Double distPlanets) {
        Double gravitational = G * (planet1.getMass() * planet2.getMass()) / Math.pow(distPlanets, 2);
        return gravitational;
    }

}
