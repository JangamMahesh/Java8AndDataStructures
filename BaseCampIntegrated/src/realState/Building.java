package realState;

public class Building {
	private String houseStatus;
	private String type;
	private String houseSize;

	public Building() {
		
	}

	public Building(String houseStatus, String type, String houseSize) {

		this.houseStatus = houseStatus;
		this.type = type;
		this.houseSize = houseSize;
	}

	public String getHouseStatus() {
		return houseStatus;
	}

	public void setHouseStatus(String houseStatus) {
		this.houseStatus = houseStatus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHouseSize() {
		return houseSize;
	}

	public void setHouseSize(String houseSize) {
		this.houseSize = houseSize;
	}

	@Override
	public String toString() {
		return "RealState [buyingHouse=" + houseStatus + ", type=" + type + ", houseSize=" + houseSize + "]";
	}

}
