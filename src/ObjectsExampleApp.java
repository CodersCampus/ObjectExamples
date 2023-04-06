
public class ObjectsExampleApp {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		// What you need to instantiate (create) an Object
		// 1. Data type
		// 2. Variable name
		// 3. the new keyword with a Constructor
		
		Computer coreI5 = new Computer(8, 500, "SSD", "Intel Core i5", 2.9);
		System.out.println(coreI5.getDiskSpace());
		System.out.println(coreI5);
		
		Computer coreI7 = new Computer(16, 500, "SSD", "Intel Core i7", 3.2);
		System.out.println(coreI7);
		
		Computer amdRyzen9 = new Computer(16, 5000, "HDD", "AMD Ryzen 9", 3.6);
		System.out.println(amdRyzen9);
		
		Computer unusedComputer = new Computer();
		System.out.println(unusedComputer);
	}

}
