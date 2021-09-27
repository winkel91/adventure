package com.company;

public class Map {

    private Player player;

    public Map() {
        Room room1 = new Room("Room 1"," ");
        Room room2 = new Room("Room 2"," ");
        Room room3 = new Room("Room 3","");
        Room room4 = new Room("Room 4"," ");
        Room room5 = new Room("Room 5"," ");
        Room room6 = new Room("Room 6"," ");
        Room room7 = new Room("Room 7"," ");
        Room room8 = new Room("Room 8"," ");
        Room room9 = new Room("Room 9"," ");

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setEast(room3);
        room2.setWest(room1);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setNorth(room5);
        room8.setWest(room7);
        room8.setEast(room9);
        room9.setNorth(room6);
        room9.setEast(room8);
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Room moveTo(Player p, Location l) {
        Room r = p.getRooms();
        Room exit;



    }



    void output(Room roomStatus){
        Location loc = new Location();
        String s;
        if(roomStatus == loc.getNoExit()) {
            s= "You can't  go this way";
        } else {
            Room r = getPlayer().getRooms();
            s="You are in "+ r.getName() + ". " +  r.getDescription();
        }
        System.out.println(s);
    }


    public Room movePlayerto(Location loc) {
        return moveTo(player, loc);
    }

    // Directions og movement:
    Location l = new Location();
    public void goNorth(){
        output(movePlayerto(l.getNorth()));
    }
    public void goSouth(){
        output(movePlayerto(l.getSouth()));
    }
    public void goWest(){
        output(movePlayerto(l.getWest()));
    }
    public void goEast(){
        output(movePlayerto(l.getEast()));
    }


    public String route(String direction){
        String msg = null;

        switch (direction){
            case "n":
            case "go north":
            case "north":
                goNorth();
                break;
            case "s":
            case "go south":
            case "south":
                goSouth();
                break;
            case "w":
            case "go west":
            case "west":
                goWest();
                break;
            case "e":
            case "go east":
            case "east":
                goEast();
                break;
            default:
                msg = "The command is invalid";
                break;
            case "Exit":
            case "exit":
                System.out.println("You have quit the game, thanks for playing!");
                System.exit(0);
                break;
            case "help":
            case "Help":
                getHelp();
                break;

            case "look":
            case "Look":
                getLook();
                break;
        }
        return msg; // May print as null
    }

    public String parseCommand(String direction){
        String msg;
        msg = route(direction);
        return msg;
    }

    public void intro(){
        String s;
        s = "Welcome to the Dark Tomb Chronicles.\n" + "You are about to embark on a journey into the dark halls of the Pharaoh's burial ground.\n"
                + "There are 9 rooms in this burial ground. Room number 5 holds the treasure you seeks, and it's your job to find it\n" +
                "Where do you want to go? Enter: go + the direction you want to go, or simply use n, s, w, e\n" + "You can always type in Exit to quit the game";

        System.out.println(s);
    }

    public void getLook(){
        String s;
        Room r = getPlayer().getRooms();
        s = "You are in " + r.getName() + ". " + r.getDescription();
        System.out.println(s);
    }
    public void getHelp(){
        String s;
        s = "Enter the direction in which you want to go. e.g. North, South, East, West. You can also you 'go' north, south, east, west.\n" +
                "Aswell as entering just the letter e.g. n, s, e, w\n" + "You can also enter look to get the describtion of the room you're in again\n" +
                "and you can always enter 'Exit' to stop the game";
        System.out.println(s);
    }

    public String RunCommand(String str){
        String s = "You have quit the game thanks for playing";
        String lowstr = str.trim().toLowerCase();
        if (!lowstr.equals("")){
            if (lowstr.equals("")){
                s = "You must enter a command";
            }else {
                s = parseCommand(lowstr);
            }
        }
        return s;
    }


}
