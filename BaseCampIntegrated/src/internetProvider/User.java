package internetProvider;

public class User {
	private String name;
	private int userId;
	private String mNo;
	private String address;
	private String internetPlan;
	public User(String name, int userId, String mNo, String address, String internetPlan) {
		this.name = name;
		this.userId = userId;
		this.mNo = mNo;
		this.address = address;
		this.internetPlan = internetPlan;
	}

	public String getName() {
		return name;
	}

	/*
	 * @Override public String toString() { return "User [name=" + name +
	 * ", userId=" + userId + ", mNo=" + mNo + ", address=" + address +
	 * ", internetPlan=" + internetPlan + "]"; }
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getmNo() {
		return mNo;
	}

	public void setmNo(String mNo) {
		this.mNo = mNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInternetPlan() {
		return internetPlan;
	}

	public void setInternetPlan(String internetPlan) {
		this.internetPlan = internetPlan;
	}

}
