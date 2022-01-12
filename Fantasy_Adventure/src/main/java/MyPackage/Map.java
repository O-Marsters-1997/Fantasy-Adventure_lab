package MyPackage;

import MyPackage.Players.Enemy;

import java.util.ArrayList;

public class Map {

    private ArrayList<Room> rooms;
    private Room room;
    private Player player1;
    private Player player2;
    private Enemy enemy;

    public Map(ArrayList<Room> rooms, Room room, Player player1, Player player2) {
        this.rooms = rooms;
        this.room = room;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Room getRoom() {
        return room;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getNumberOfRooms() {
        return this.rooms.size();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void selectRoom() {
        this.room = rooms.get(0);
    }

    public void removeRoom() {
        this.rooms.remove(0);
    }

    public void nextRoom(){
        if (this.rooms.size()!= 1) {
            removeRoom();
            selectRoom();
        }else{
            removeRoom();
        }
    }

    public void play(Room room){
        Enemy monster = room. 
    }
}
