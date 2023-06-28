package taxi;

public class TaxiDriver {
	private String taxiNumber;
	private String driverName;
	private int driverId;
	private int tDistance;

	public TaxiDriver() {

	}

	public TaxiDriver(String taxiNumber, String driverName, int driverId, int tDistance) {
		this.taxiNumber = taxiNumber;
		this.driverName = driverName;
		this.driverId = driverId;
		this.tDistance = tDistance;
	}

	public String getTaxiNumber() {
		return taxiNumber;
	}

	public void setTaxiNumber(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int gettDistance() {
		return tDistance;
	}

	public void settDistance(int tDistance) {
		this.tDistance = tDistance;
	}

	public String toString() {
		return "TaxiDriver [taxiNumber=" + taxiNumber + ", driverName=" + driverName + ", driverId=" + driverId
				+ ", tDistance=" + tDistance + "]";
	}

}
