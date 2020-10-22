package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int index = 0;
        double minValue = Double.MAX_VALUE;
        int n = scanner.nextInt();
        double[] array = new double[n];

        System.out.print("Enter array values: ");

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextFloat();
        }

        for(int i = 0; i < array.length; i++){

            if(array[i] < minValue){
                minValue = array[i];
                index = i;
            }
        }

        System.out.println("Min index: " + index);
    }
}
