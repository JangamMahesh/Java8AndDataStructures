package bikeShowRoom;

public class Bike {
	private String make;
	private int model;
	private String type;
	private int engineCC;
	private long price;
	public Bike() {
	}
	public Bike(String make, int model, String type, int engineCC, long price) {
		this.make = make;
		this.model = model;
		this.type = type;
		this.engineCC = engineCC;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
