package random;
import java.util.Scanner;

public class run {

    public static void main(String[] args) {
        
        Scanner opnum = new Scanner(System.in);
        double nums[] = new double[5];
        double num = 0;
        Order or= new Order();
        
        System.out.println("These are your numbers before to order.");
        System.out.print("[");
        for (int i = 0; i <= 4; i++) {
            num = Math.random() * 10;
            nums[i] = Math.round(num * 10);
            System.out.print(" "+nums[i]+" ");
        }
        System.out.println("]");
        
        System.out.println("Which method to order do you want to user?");
        System.out.println("1. Bubble sort ");
        System.out.println("2. Quick sort");
        int op = opnum.nextByte();
        switch (op) {
            case 1:
                 System.out.print("[");
                for (double n : or.BubbleSort(nums)) { // Mediante el metodo burbuja
                    System.out.print(" " + n + " ");
                }
                System.out.print("]");            
            break;
            
            case 2:
              
            
             System.out.print("[");
                for (double n : or.QuickSort(nums, 0, nums.length - 1)) { //Mediante el metodo quick sort 
                    System.out.print(" " + n + " ");
                }
                System.out.print("]");
                break;
            
            default:
                System.out.println("Wrong option");
                    
        }
        
    }
    
}