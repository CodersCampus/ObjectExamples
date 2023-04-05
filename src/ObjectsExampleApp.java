
public class ObjectsExampleApp {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		// What you need to instantiate (create) an Object
		// 1. Data type
		// 2. Variable name
		// 3. the new keyword with a Constructor
		
		Computer coreI5 = new Computer();
		coreI5.cpuSpeed = 2.9;
		coreI5.cpuType = "Intel Core i5";
		coreI5.diskSpace = 500;
		coreI5.diskType = "SSD";
		coreI5.ram = 8;
		System.out.println(coreI5);
		
		Computer coreI7 = new Computer();
		coreI7.cpuSpeed = 3.2;
		coreI7.cpuType = "Intel Core i7";
		coreI7.diskSpace = 500;
		coreI7.diskType = "SSD";
		coreI7.ram = 16;
		System.out.println(coreI7);
		
		Computer amdRyzen9 = new Computer();
		amdRyzen9.cpuSpeed = 3.6;
		amdRyzen9.cpuType = "AMD Ryzen 9";
		amdRyzen9.diskSpace = 5000;
		amdRyzen9.diskType = "HDD";
		amdRyzen9.ram = 16;
		System.out.println(amdRyzen9);
	}

}
