package com.course.structure;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        building.display();

        House house = new House();
        house.display();
        house.displayRooms();

        School school = new School();
        school.display();
        school.displayRooms();
    }
}
