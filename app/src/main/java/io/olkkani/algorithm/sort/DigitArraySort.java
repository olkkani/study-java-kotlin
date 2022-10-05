package io.olkkani.algorithm.sort;

public class DigitArraySort {


    static int[] insertionSort(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {

            int number = numbers[i];
            int j = i -1 ;

            while (j >=0 && number < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }

            numbers[j+1] = number;
        }

        return numbers;
    }

    static int[] bubbleSort(int[] numbers){
        for (int i = numbers.length; i > 0; i--) {
            int j = i;
            int k = 0;

                int z = numbers[k];
                while (j > 0 && k+1 < i){
                    if (z < numbers[k+1]){
                        numbers[k] = z;
                        z = numbers[k+1];
                    }else {
                        numbers[k] = numbers[k+1];
                    }
                    k++;
                    j--;
                }
                numbers[k] = z;
        }
        return numbers;
    }

}
