package Question9;
import java.util.Comparator;
import java.util.TreeSet;

 class Account {

	int ID;
	int Balance;
	String Name;
	String Salary;

	Account(int iD, int balance, String name, String salary) {
		super();
		ID = iD;
		Balance = balance;
		Name = name;
		Salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Account [ID=" + ID + ", Balance=" + Balance + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	void WithDraw() {
	}
 void Deposit() {

	}

}
