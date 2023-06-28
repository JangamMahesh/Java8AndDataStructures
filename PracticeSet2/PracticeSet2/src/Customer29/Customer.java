package Customer29;

public class Customer {

	private int custId=0;
	private String custName="xxx";
	private String custAddress="bangolor";
	private String accType="savings";
	private double custBalance=0;
	
	public Customer(int custId, String custName, String custAddress, String accType, double custBalance) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.accType = accType;
		this.custBalance = custBalance;
	}
	public Customer(int custId,String custName)
	{
		this.custId= custId;
		this.custName=custName;
		/*custAddress= "Ramnagar,Bangalore-30";
		accType = "SBI";
		custBalance = 1000;*/
		
	}
	public Customer(int custId,String custName,String custAddress)
	{

		this.custId= custId;
		this.custName=custName;
		this.custAddress=custAddress;
		/*accType = "SBI";
		custBalance = 1000; */
	}
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", accType="
				+ accType + ", custBalance=" + custBalance + "]";
	}


}
