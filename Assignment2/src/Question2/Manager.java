package Question2;

public class Manager extends Employee {
	public static final double incentive=0.2;
	public Manager(int EmployeeId,String EmployeeName,double Salary)
	{
		super(EmployeeId,EmployeeName,Salary);
	}
	public double getSalary()
	{
		return Salary+Salary*incentive;
	}

}

