package FeedBackAplication;

public class Customer {
	private String Name;
	private String MobileNo;
	private double feedbackRating;
	public Customer(String name, String mobileNo, double feedbackRating) {
		this.Name = name;
		this.MobileNo = mobileNo;
		this.feedbackRating = feedbackRating;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.MobileNo = mobileNo;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	
	public String toString() {
		return "Customer [Name=" + Name + ", MobileNo=" + MobileNo + ", feedbackRating=" + feedbackRating + "]";
	}
	
	
}
