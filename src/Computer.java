
public class Computer {

	Integer ram;
	Integer diskSpace;
	String diskType;
	String cpuType;
	Double cpuSpeed;
	
	public Computer() {
		// This is the Computer class's NO ARGUMENT constructor
		System.out.println("We are instantiating a new Computer object!");
		ram = 0;
		diskSpace = 0;
		diskType = "No Disk Type Set";
		cpuType = "No CPU Type Set";
		cpuSpeed = 0.0;
	}
	
	public String toString() {
        return "CPU Type: " + cpuType + 
        		", CPU Speed: " + cpuSpeed + "GHz" + 
        		", RAM: " + ram + "GB" +
        		", Disk Type: " + diskType + 
        		", Disk Space: " + diskSpace + "GB";
    }
}
