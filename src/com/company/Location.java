package com.company;

public class Location {

    private Room north;
    private Room south;
    private Room west;
    private Room east;

    private Room noExit;

    public Location(){
        this.north = north;
        this.south = south;
        this.west = west;
        this.east = east;
        this.noExit = noExit;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;

    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getNoExit() {
        return noExit;
    }

    public void setNoExit(Room noExit) {
        this.noExit = noExit;
    }
}
