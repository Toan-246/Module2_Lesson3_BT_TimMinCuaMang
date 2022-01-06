package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size của mảng");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for (int i= 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử " +i);
            arr[i] = sc.nextInt();
        }
        System.out.println("In ra mảng");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min của mảng là: " + min + " Tại vị trí " + index);
    }
}
