package com.course.structure;

import java.util.Scanner;

public class House extends Building {
    int noBedRooms;
    int noBathRooms;

    public House() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of bed rooms: ");
        noBedRooms = sc.nextInt();
        System.out.println("Enter number of bath rooms: ");
        noBathRooms = sc.nextInt();
    }

    public House(double sqFeet, int stories, int noBedRooms, int noBathRooms) {
        super(sqFeet, stories);
        this.noBedRooms = noBedRooms;
        this.noBathRooms = noBathRooms;
    }

    public void displayRooms() {
        System.out.println("Number of bed rooms: " + noBedRooms);
        System.out.println("Number of bath rooms: " + noBathRooms);
    }
}
