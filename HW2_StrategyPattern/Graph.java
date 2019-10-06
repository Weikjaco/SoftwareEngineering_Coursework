package Client;


public class Graph implements Store {
	public void store() {
		// use default storage method (node store)
		System.out.println("This is the node store method");
	}
        
	public void setStoreStrategy(String strategy) {
                System.out.println("SetStorageStrategy() Method");
                System.out.println("----------------");
		if (strategy.equals("table")) {
			Store newStrategy = new Relational();
			newStrategy.store();
		}
		else if (strategy.equals("document")) {
			Store newStrategy = new NoSQL();
			newStrategy.store();
		}
	}
}
