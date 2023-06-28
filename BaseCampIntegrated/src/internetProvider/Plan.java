package internetProvider;

public class Plan {
	private String planName;
	private double internetSpeed;
	private double downloadGB;
	private float price;

	public Plan() {

	}

	public Plan(String planName, double internetSpeed, double downloadGB, float price) {
		this.planName = planName;
		this.internetSpeed = internetSpeed;
		this.downloadGB = downloadGB;
		this.price = price;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	public double getDownloadGB() {
		return downloadGB;
	}

	public void setDownloadGB(double downloadGB) {
		this.downloadGB = downloadGB;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
