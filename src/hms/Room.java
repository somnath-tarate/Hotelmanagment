package hms;

public class Room {

	private int roomNumber;
	private String roomType;
	private boolean seaFacing;
	private double price;
	
	 
	Room(){
		
	}


	public int getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public boolean isSeaFacing() {
		return seaFacing;
	}


	public void setSeaFacing(boolean seaFacing) {
		this.seaFacing = seaFacing;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


}
