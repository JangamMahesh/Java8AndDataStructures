package Employee27;

public class Employee {
	private int empId;
	private String empName;
	private String empDesign;
	private String empDept;

	public Employee() {
		this.empId = empId;
		this.empName = empName;
		this.empDesign = empDesign;
		this.empDept = empDept;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesign=" + empDesign + ", empDept=" + empDept
				+ "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;

	}

	public void setEmpName(String empName) {
	this.empName = empName;
		if (this.empName.equalsIgnoreCase("null")) {
			System.out.println("name should not be null:");
		} else {
			System.out.println(getEmpName());
		}
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
	this.empDesign = empDesign;
		if (this.empDesign.equalsIgnoreCase("Developer") || this.empDesign.equalsIgnoreCase("Tester")
				|| this.empDesign.equalsIgnoreCase("Manager")) {
			System.out.println(this.getEmpDesign());
		} else {
			System.out.println("Invalid designation");
		}
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
		if (this.empDept.equalsIgnoreCase("TTH") || this.empDept.equalsIgnoreCase("RCM") || this.empDept.equalsIgnoreCase(" Digital")
				|| this.empDept.equalsIgnoreCase("DevOps")) {

			System.out.println(this.getEmpDept());
		} else {
			System.out.println("invalid department");
		}
	}


}
