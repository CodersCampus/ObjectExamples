
public class Computer {

	Integer ram;
	Integer diskSpace;
	String diskType;
	String cpuType;
	Double cpuSpeed;
	
	public String toString() {
        return "CPU Type: " + cpuType + 
        		", CPU Speed: " + cpuSpeed + "GHz" + 
        		", RAM: " + ram + "GB" +
        		", Disk Type: " + diskType + 
        		", Disk Space: " + diskSpace + "GB";
    }
}
