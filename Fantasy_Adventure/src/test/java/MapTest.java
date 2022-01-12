import MyPackage.Map;
import MyPackage.Player;
import MyPackage.Players.Barbarian;
import MyPackage.Players.Cleric;
import MyPackage.Room;
import MyPackage.WeaponType;
import org.junit.Before;
import org.junit.Test;

import java.beans.Transient;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MapTest {

    private Map map;
    private ArrayList<Room> rooms;
    private Room room1;
    private Room room2;
    private Room room3;
    private Barbarian player1;
    private Cleric player2;


    @Before
    public void before() {
        rooms = new ArrayList<>();
        room1 = new Room();
        room2 = new Room();
        room3 = new Room();
        player1 = new Barbarian(500, 25, 50, WeaponType.AXE);
        player2 = new Cleric(750, 60, "Medicine");
        map = new Map(rooms, room1, player1, player2);
    }

    @Test
    public void hasPlayer1() {
        assertEquals(player1, map.getPlayer1());
    }

    @Test
    public void hasPlayer2() {
        assertEquals(player2, map.getPlayer2());
    }


    @Test
    public void mapIsEmpty() {
        assertEquals(0, map.getNumberOfRooms());
    }

    @Test
    public void mapHasRooms() {
        map.addRoom(room1);
        map.addRoom(room1);
        map.addRoom(room1);
        map.addRoom(room1);
        map.addRoom(room1);
        assertEquals(5, map.getNumberOfRooms());
    }

    @Test
    public void mapCanSetRoom() {
        map.addRoom(room1);
        map.addRoom(room2);
        map.addRoom(room3);
        map.selectRoom();
        assertEquals(room1, map.getRoom());
    }

    @Test
    public void canRemoveRoom() {
        map.addRoom(room1);
        map.removeRoom();
        assertEquals(0, map.getNumberOfRooms());
    }

    @Test
    public void canGoToNextRoom() {
        map.addRoom(room1);
        map.addRoom(room2);
        map.nextRoom();
        assertEquals(room2, map.getRoom());
    }

    @Test
    public void cantGoToNextRoom(){
        map.addRoom(room2);
        map.nextRoom();
        assertEquals(0, map.getNumberOfRooms());
    }

}
