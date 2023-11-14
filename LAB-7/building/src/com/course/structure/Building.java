package com.course.structure;

import java.util.Scanner;

public class Building {
    double sqFeet;
    int stories;

    public Building() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter area in sq. ft: ");
        sqFeet = sc.nextDouble();
        System.out.println("Enter number of stories: ");
        stories = sc.nextInt();
    }

    public Building(double sqFeet, int stories) {
        this.sqFeet = sqFeet;
        this.stories = stories;
    }

    public void display() {
        System.out.println("Area (sq. ft): " + sqFeet);
        System.out.println("Number of stories: " + stories);
    }
}
