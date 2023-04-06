
public class Computer {
	
	// Visibility modifiers are:
	// 1. public     (most open / visible)
	// 2. protected
	// 3. package
	// 4. private    (least open / visible)
	
	private Integer ram;
	private Integer diskSpace;
	private String diskType;
	private String cpuType;
	private Double cpuSpeed;

	public Computer () {
		// This is the Computer class's NO ARGUMENT constructor
		System.out.println("We are instantiating a new Computer object via the NO arg constructor!");
		ram = 0;
		diskSpace = 0;
		diskType = "No Disk Type Set";
		cpuType = "No CPU Type Set";
		cpuSpeed = 0.0;
	}
	
	public Computer (Integer ram, 
			Integer diskSpace, 
			String diskType, 
			String cpuType, 
			Double cpuSpeed) {
		System.out.println("We are instantiating a new Computer object via the 5 arg constructor!");
		this.ram = ram;
		this.diskSpace = diskSpace;
		this.diskType = diskType;
		this.cpuType = cpuType;
		this.cpuSpeed = cpuSpeed;
	}
	
	public String toString() {
        return "CPU Type: " + cpuType + 
        		", CPU Speed: " + cpuSpeed + "GHz" + 
        		", RAM: " + ram + "GB" +
        		", Disk Type: " + diskType + 
        		", Disk Space: " + diskSpace + "GB";
    }
}
