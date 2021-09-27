package com.company;

public class Player extends Room {
    private Room rooms;

    public Player(String name, String description, Room rooms) {
        super(name, description);
        this.rooms = rooms;
    }

    public Room getRooms() {
        return rooms;
    }

    public void setRooms(Room rooms) {
        this.rooms = rooms;
    }
}