package Question9;

import java.util.TreeSet;

class Bankacc {

	public static void main(String[] args) {

		Account a1 = new Account(1999, 103, "anu", "Salray");

		Account a2 = new Account(1998, 101, "pachu", "Salray");

		Account a3 = new Account(1997, 101, "pinju", "Salray");

		Account a4 = new Account(1996, 104, "aju", "Salray");

		TreeSet<Account> n= new TreeSet<>(new MyComparator());

		n.add(a1);
		n.add(a2);
		n.add(a3);
		n.add(a4);

		System.out.println(n);

	}

}