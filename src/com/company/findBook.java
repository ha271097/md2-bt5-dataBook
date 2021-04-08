package com.company;

import java.util.Scanner;

public class findBook {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Book databooks [] = new Book[10];
        databooks[0] = new Book("Book1", 10 , "java");
        databooks[1] = new Book("Book2", 11, "java");
        databooks[2] = new Book("Book3", 12 , "javas");
        databooks[3] = new Book("Book4", 13 , "javas");
        databooks[4] = new Book("Book5", 14 , "javas");
        databooks[5] = new Book("Book6", 15 , "java");
        databooks[6] = new Book("Book7", 16 , "javas");
        databooks[7] = new Book("Book8", 17 , "java");
        databooks[8] = new Book("Book9", 18 , "javas");
        databooks[9] = new Book("Book10", 19 , "java");
        int total = 0;
        int count = 0;

        for (int i = 0 ; i < databooks.length ; i++) {
            total += databooks[i].getPrice();
            if(databooks[i].getLanguage() == "java"){
                count ++;
            }
        }
        System.out.println(" total price = " + total);
        System.out.println(" language of book is java total = " + count);
        System.out.println(" enter monney : ");
        int testMonney = sc.nextInt();
        for (int i = 0 ; i < databooks.length ; i++) {
            if(databooks[i].getPrice() < testMonney ){
                System.out.println(databooks[i].getName());
            }
        }
    }

}
