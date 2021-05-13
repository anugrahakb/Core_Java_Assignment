package Question6;

public class Main {
	public static void main(String[] args) {
		Persistence d=new DatabasePersistence();
		Persistence f = new FilePersistence();
		d.persist();
		f.persist();

	}

}



