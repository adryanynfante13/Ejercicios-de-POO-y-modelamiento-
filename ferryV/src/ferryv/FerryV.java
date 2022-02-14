
package ferryv;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author adrya
 */
public class FerryV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        ArrayList<ferryVehicle> LisV = new ArrayList<>();
        int pass, tires, cr, i = 1;
        String reg, col;
        boolean cre = false;
        System.out.println("-----Welcome to FeRRy-----");
        System.out.println("Type the information to register the vehicle in our system.");
        do {
            System.out.println("Vehicle #" + i);
            System.out.println("Enter number of passangers' sits: ");
            pass = str.nextInt();
            System.out.println("Enter number of tires: ");
            tires = str.nextInt();
            System.out.println("Enter year of register: ");  //Se capturan los datos por medio de consola y se instancia la clase vehiculo.
            reg = str2.nextLine();
            System.out.println("Enter vechicle's colour: ");
            col = str2.nextLine();
            System.out.println("Are there crew in the vechicle?");
            System.out.println("1.Yes" + "\n2.No");
            cr = str3.nextInt();
            switch (cr) {
                case 1:
                    cre = true;
                    break;
                case 2:
                    cre = false;
                    break;
            }
            ferryVehicle ve = new ferryVehicle(pass, cre, tires, reg, col);
            LisV.add(ve); //Se agrega el vehiculo a un arreglo y se repite con un maximo de (10)
            i++;
        } while (i < 11);
        
        System.out.println("===============================");
        int m=1;
        for(ferryVehicle v:LisV){
            System.out.println("Vechicle #"+m+"\n");
            System.out.println(v.toString()); //Se imprime la informacion almacenada en el arreglo de vehiculos
            System.out.println("==========================");
            m++;
        }
    }

}
