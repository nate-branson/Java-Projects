import java.util.Arrays;

/**
 * ShuffleTest.java
 * @author Nathan Branson 
 */


public class ShuffleTest{
    public static void main(String[] args){

        /****
            Shuffle from page 97
        ****/
 

        // how big the 2-D array is
        int m = Integer.parseInt(args[0]);

        // number of simulation trials
        int n = Integer.parseInt(args[1]);

        // 2-D array size m, #s 0 to m
        int[] array = new int[m];
        for(int i = 0; i < m; i++){
            array[i] = i;
        }

        // 2-D array size m x m with all 0s
        int[][] results = new int[m][m];

        // copy of first array
        int[] arrayNew;
        for (int j = 0; j < n; j++){
            arrayNew = Arrays.copyOf(array, array.length);

            // shuffling each copy
            for (int k = 0; k < m; k++){
                int r = k + (int)(Math.random() * (m-k));
                int temp = arrayNew[k];
                arrayNew[k] = arrayNew[r];
                arrayNew[r] = temp;
            }
            for (int k = 0; k < m; k++){
                results[arrayNew[k]][k] += 1;
            }
        }

        // accumulator
        double accumulate = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                accumulate += Math.abs(results[i][j] - ((double) n / m));
            }
        }
        
        double average = accumulate / (m*m) / n;
        System.out.println("The average for shuffle page 97: " + average);

/***********************************************************************************************************/
        

        /****
            Shuffle from exercise 25 
        ****/

        // 2-D array size m, #s 0 to m
        int[] array2 = new int[m];
        for(int i = 0; i < m; i++){
            array2[i] = i;
        }

        // 2-D array size m x m with all 0s
        int[][] results2 = new int[m][m];

        // copy of first array
        int[] arrayNew2;
        for (int j = 0; j < n; j++){
            arrayNew2 = Arrays.copyOf(array2, array2.length);

            // shuffling each copy
            for (int k = 0; k < m; k++){
                int r = k + (int)(Math.random() * (0-k));
                int temp = arrayNew2[k];
                arrayNew2[k] = arrayNew2[r];
                arrayNew2[r] = temp;
            }
            for (int k = 0; k < m; k++){
                results2[arrayNew2[k]][k] += 1;
            }
        }

        // accumulator
        double accumulate2 = 0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++){
                accumulate2 += Math.abs(results2[i][j] - ((double) n / m));
            }
        }
        
        double average2 = accumulate2 / (m*m) / n;
        System.out.println("The average for shuffle exercise 25: " + average2);
    }
}
