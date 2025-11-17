package izi;

import java.util.Arrays;

public class mas {
    public static void main(String[] args) {
        String [] arr = {"dgf"};
        System.out.println(arr[0]);
        int [] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int num : arr1){
            System.out.print(num);

        }
        System.out.println();
        for(int i = 0; i<3; i++){
            System.out.print(arr1[i]);
            System.out.println();
            System.out.print(i);
            System.out.println();
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] % 2 == 0){
                System.out.print(i);

            }
        }
        System.out.println();
        for(int num11 : arr1){
            if(num11 % 2 == 0){
                System.out.print(num11);
            }
        }
        System.out.println();

        int [] gr1 = {1, 2 , 3, 4};
        int [] gr2 = {5, 6, 7, 8, 9};
        int [][] gr12 = {gr1, gr2};
        upperFor:
        for(int[] array : gr12){
            System.out.println(Arrays.toString(array));
           for(int number : array){
               System.out.println(number);
               if(number == 7){
                   System.out.println("this");
                   break upperFor;

               } else{
                   System.out.println("not this");
               }

           }
        }



    }
}
