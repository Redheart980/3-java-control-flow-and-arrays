package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int num = 0;
        for(int min = Integer.MAX_VALUE, i = 0; i < arr.length; i++){
            if (min >= arr[i]){
                min = arr[i];
                num = i;
            }
        }
        return num;
    }

}