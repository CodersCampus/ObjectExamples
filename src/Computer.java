
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

	public Integer getDiskSpace () {
		return this.diskSpace;
	}
	
	public void setDiskSpace (Integer newDiskSpaceValue) {
		if (newDiskSpaceValue != null) {
			if (newDiskSpaceValue > 0 && newDiskSpaceValue < Integer.MAX_VALUE) {
				this.diskSpace = newDiskSpaceValue;			
			}			
		}
	}
	
	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public String getDiskType() {
		return diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public Double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(Double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

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
