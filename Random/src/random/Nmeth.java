
package random;

/**
 *
 * @author adrya
 */
public class Nmeth {
     public double[] QuickSort(double[] nums, int one, int last) { //Algoritmo QuickSort
        int i, j;
        double piv, temp;
        i = one;
        j = last;
        piv = nums[(one + last) / 2];
        do {
            while (nums[i] < piv) {
                i++;
            }
            while (nums[j] > piv) {
                j--;
            }

            if (i <= j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }

        } while (i <= j);
        if (one < j) {
            QuickSort(nums, one, j);
        }
        if (i < last) {
            QuickSort(nums, i, last);
        }

        return nums;
    }

    public double[] BubbleSort(double[] nums) { //Algoritmo Burbuja
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    double temps = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temps;
                }

            }

        }

        return nums;
    }

}
