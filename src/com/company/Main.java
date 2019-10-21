package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MergeSortExample mergeSortExample = new MergeSortExample();
        Integer tamanho = 32;
        Integer limite = 100;
        Integer[] arrayOfElements = new Integer[tamanho];

        arrayOfElements = populateArray(arrayOfElements, limite);

        System.out.println("\n Array before sorting: " + Arrays.toString(arrayOfElements));

        mergeSortExample.mergeSort(arrayOfElements);

        System.out.println("Sorted array is: " + Arrays.toString(arrayOfElements));

    }

    public static Integer[] populateArray(Integer[] array,int tam){
        Random rd = new Random();
        for (int i =0; i < array.length; i++){
            array[i] = rd.nextInt(tam);
        }

        return array;
    }


}
