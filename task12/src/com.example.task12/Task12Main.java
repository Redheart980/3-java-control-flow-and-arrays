package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int min = arr[i], j = i; j < arr.length; j++) {
                    if (min > arr[j]) {
                        min = arr[j];
                        arr[j] = arr[i];
                        arr[i] = min;
                    }
                }
            }
        }
    }

}