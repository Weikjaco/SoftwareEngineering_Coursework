package Client;

public class NoSQL implements Store {
	public void store() {
		// use default storage method (document store)
		System.out.println("This is the document store method");
	}
	public void setStoreStrategy(String strategy) {
                System.out.println("SetStorageStrategy() Method");
                System.out.println("----------------");
		if (strategy.equals("table")) {
			Store newStrategy = new Relational();
			newStrategy.store();
		}
		else if (strategy.equals("node")) {
			Store newStrategy = new Graph();
			newStrategy.store();
		}
	}
}
