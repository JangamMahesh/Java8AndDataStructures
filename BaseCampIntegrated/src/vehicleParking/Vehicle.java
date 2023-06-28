package vehicleParking;

public class Vehicle {
	private String vid;
	private String entryTime;
	private String exitTime;

	public Vehicle() {
	}

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getExitTime() {
		return exitTime;
	}

	public void setExitTime(String exitTime) {
		this.exitTime = exitTime;
	}

	public Vehicle(String vid, String entryTime) {
		this.vid = vid;
		this.entryTime = entryTime;

	}

}
