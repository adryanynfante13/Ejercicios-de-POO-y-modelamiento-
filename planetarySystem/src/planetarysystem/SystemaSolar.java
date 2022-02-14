/*
**@adryan 
*/

package planetarysystem;

import java.util.Random;
import java.util.Scanner;

//creacion de clase abstracta y definicion de los cuerpos...

public abstract class SystemaSolar {

    Random claseRandom = new Random();
    Scanner in = new Scanner(System.in);

    protected String name;
    protected int id;
    protected Double mass;
    protected Double density;
    protected Double diameter;
    protected Double distanceSun;


//constructor y solicitud de datos al usuario para realizar calculos

    public SystemaSolar() {
        System.out.println("Enter planet name: ");
        this.name = in.nextLine();
        this.id = claseRandom.nextInt(1000);;
        System.out.println("Enter planet mass in kg: ");
        this.mass = in.nextDouble();
        System.out.println("Enter the density: ");
        this.density = in.nextDouble();
        System.out.println("Enter the diameter: ");
        this.diameter = in.nextDouble();
        System.out.println("Enter distance to the sun in meters: ");
        this.distanceSun = in.nextDouble();

    }
    
    
//se muestra la informacion cargada por el usuario
    public void getSystemSolar() {
        System.out.println("The name of the planet is: " + name);
        System.out.println("Id: " + id);
        System.out.println("Mass: " + mass + "kg");
        System.out.println("Density: " + density);
        System.out.println("Diameter: " + diameter);
        System.out.println("Distance to the sun: " + distanceSun);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(Double distanceSun) {
        this.distanceSun = distanceSun;
    }

}
