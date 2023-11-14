package com.course.structure;

import java.util.Scanner;

public class School extends Building {
    int noClassRooms;
    String gradeLevel; // Elementary, Junior High

    public School() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of class rooms: ");
        noClassRooms = sc.nextInt();
        System.out.println("Enter the grade level: ");
        gradeLevel = sc.next();
    }

    public School(double sqFeet, int stories, int noClassRooms, String gradeLevel) {
        super(sqFeet, stories);
        this.noClassRooms = noClassRooms;
        this.gradeLevel = gradeLevel;
    }

    public void displayRooms() {
        System.out.println("Number of class rooms: " + noClassRooms);
        System.out.println("Grade level: " + gradeLevel);
    }
}
