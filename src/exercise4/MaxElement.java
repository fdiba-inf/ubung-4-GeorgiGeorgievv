package exercise4;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        System.out.print("Enter array values: ");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        double maxElement = array[0];

        for (int i = 1; i < size; i++) {
            if(maxElement < array[i]){
                maxElement = array[i];
            }
        }

        System.out.print("Max number: " + maxElement);


    }
}
