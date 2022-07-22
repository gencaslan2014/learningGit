package com.company;

import java.util.Scanner;

public class Arrays {
    Scanner sc = new Scanner(System.in);

    public void deletionOfElement(int[] array){
        System.out.println("Here is the current array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Please tell us which number you want to delete:");
        int userChoice = sc.nextInt();
        int counter = 0;

        for (int i=0;i<array.length;i++){
            if (userChoice!=array[i]){
                array[counter]=array[i];
                counter++;
            }
        }

        for (int i=0;i<counter;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int deletion = array.length-counter;
        System.out.println("The array was having "+array.length+" elements");
        System.out.println("The number got deleted "+deletion+" times");

        int[] newArray = new int[counter];

        for (int i=0;i<counter;i++){
            newArray[i] = array[i];
        }

        System.out.println("Here is your newArray:");
        for (int i=0;i<newArray.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public void additionOfElement(int[] array){
        System.out.println("Here is the current array:");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Please tell us which number you want to add:");
        int userNumber = sc.nextInt();
        System.out.println("Please tell us at which Index you want to add this number:");
        int numberIndex = sc.nextInt();
        int newLength = array.length+1;

        int [] newArray = new int[newLength];
        System.out.println("The previous array was having the length "+array.length);
        System.out.println("A newArray with the length "+ newArray.length +" has been created");

        for (int i=0;i<numberIndex;i++){
            newArray[i] = array[i];
        }

        newArray[numberIndex] = userNumber;

        for (int i=numberIndex;i<array.length;i++){
            newArray[i+1]=array[i];
        }

        System.out.println("Here is your newArray:");
        for (int j : newArray) {
            System.out.print(j + " ");
        }
    }
}
