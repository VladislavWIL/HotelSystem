package com.homework.booking.empty;

public class Hotel {

    private String nameHotel;
    private Room[] rooms;

    public Hotel(String nameHotel, Room[] rooms) {
        this.nameHotel = nameHotel;
        this.rooms = rooms;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        int tempNumber = 0;
        for (Room room : rooms) {
            tempNumber++;
            System.out.println("№ " +tempNumber + " - " + room.isFree());
        }
    }
}
