public class Counter {
	static int count = 0;
	
	Counter() {
		System.out.println("Created Counter Object");
		count++;
	}
	
	static void getCount() {
		System.out.println("The number of Counter objects is: " + count);
	}
	
	public static void main(String args[]) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		getCount();
		Counter obj3 = new Counter();
		getCount();
	}
}
