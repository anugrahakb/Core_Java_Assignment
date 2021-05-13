package Question2;

public class Labour extends Employee {
	public static final double overTime=0.1;
	public Labour(int EmployeeId,String EmployeeName,double Salary)
	{
		super(EmployeeId,EmployeeName,Salary);
	}
	public double getSalary()
	{
		return Salary+Salary*overTime;
	}

}
