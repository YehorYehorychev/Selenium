package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,-4,7,8,9,-100,88,-1245,14};
        int[] array2 = {1,3,-4,7,8,9,-100,88,-1245,14};
        int min = 0;
        int max = 0;

        for(int i = 0; i <= array.length; i++) {
            if(i+1 == array.length) {
                break;
            }
            if(array[i]<array[i+1]){
                min = array[i];
            }
            if(array[i]>array[i+1]){
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    Arrays.sort(array2);



        for(int b = 0; b <= array.length-1;b++){
            for(int c= 0; c <= array.length;c++){
                if(c+1 == array.length) {
                    break;
                }
                if(array[c]>array[c+1]){
                    int temp = array[c];
                    array[c]=array[c+1];
                    array[c+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}