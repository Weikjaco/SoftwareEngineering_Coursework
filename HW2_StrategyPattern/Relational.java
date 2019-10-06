package Client;

public class Relational implements Store {
	public void store() {
		// use default storage method (table store)
		System.out.println("This is the table store method");
	}
	public void setStoreStrategy(String strategy) {
                System.out.println("SetStorageStrategy() Method");
                System.out.println("----------------");
		if (strategy.equals("document")) {
			Store newStrategy = new NoSQL();
			newStrategy.store();
		}
		else if (strategy.equals("node")) {
			Store newStrategy = new Graph();
			newStrategy.store();
		}
	}
}
