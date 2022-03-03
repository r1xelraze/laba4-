package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scan.nextInt();
        int [] nums= new int [n];
        System.out.println("Введите элементы массива: ");
        for (int i =0; i<n; i++){
            nums[i]=scan.nextInt();
        }
        int min=nums[0];
        for(int i=0; i<n; i++)
        {
            if (min>nums[i])
            {
                min=nums[i];
            }
        }
        int S=0;
        for(int i=0; i<n; i++)
        {
            S+=nums[i];
        }
        System.out.println("Сумма минимального и среднего значения:  " +(S/n+min));
        System.out.println(min);


    }
}
