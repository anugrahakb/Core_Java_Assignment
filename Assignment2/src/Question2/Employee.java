package Question2;

public class Employee {

	int EmployeeId;
	String EmployeeName;
	double Salary;
	
	public Employee(int EmployeeId,String EmployeeName,double Salary)
	{
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.Salary = Salary;
	}
	public int getEmployeeId()
	{
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId)
	{
		this.EmployeeId = EmployeeId;
	}
	public String getEmployeeName()
	{
		return EmployeeName;
	}
	public void setEmployeeName(String EmployeeName)
	{
		this.EmployeeName = EmployeeName;
	}
	public double getSalary()
	{
		return Salary;
	}
	public void setSalary(double Salary)
	{
		this.Salary = Salary;
	}
		

}

