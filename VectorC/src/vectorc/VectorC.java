package vectorc;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author adrya
 */
public class VectorC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vector vector = new Vector();
        Scanner read = new Scanner(System.in);
        int num, temp = 0, temp2 = 0, cont = 0;
        do {
            System.out.println("If you enter the same number twice in a row, the app stops. \nType a number to save: ");
            num = read.nextInt();
//lgoritmo logico para solicitarnumeros y finalizar cuando se repitan estos.
            if (cont <= 0) {
                temp = num;
                vector.add(num);
                if (temp == temp2) {
                    temp2 = temp + 1;
                }
            } else {
                temp2 = temp;
                temp = num;
                if (temp2 != temp) {
                    vector.add(num);
                }
            }
            cont++;
        } while (temp != temp2);

        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.elementAt(i) + "\t"); //Se imprime
        }

    }

}
