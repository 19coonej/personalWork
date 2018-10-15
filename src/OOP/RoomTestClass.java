package OOP;

public class RoomTestClass {

	public static void main(String[] args) {
	Room areaMan = new Room();
	areaMan.area();
	Room areaManNo = new Room();
	areaManNo.areaWithDoor();
	Room closet = new Room();
	Room kitchen = new Room();
	kitchen = closet;
	Room basement = new Room();
	closet = basement;
	closet.area();
	

	}

}
