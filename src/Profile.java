import java.time.LocalDate;
import java.util.Date;

public class Profile {
	private String name;
	private Date birthdate; // Note: don't mix and match Date with LocalDate
	private LocalDate createdDate;
	private String mainPhotoUrl;
	
	public Profile(String name, Date birthdate, LocalDate createdDate, String mainPhotoUrl) {
		this.name = name;
		this.birthdate = birthdate;
		this.createdDate = createdDate;
		this.mainPhotoUrl = mainPhotoUrl;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public String getMainPhotoUrl() {
		return mainPhotoUrl;
	}
	public void setMainPhotoUrl(String mainPhotoUrl) {
		this.mainPhotoUrl = mainPhotoUrl;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", birthdate=" + birthdate + ", createdDate=" + createdDate + ", mainPhotoUrl="
				+ mainPhotoUrl + "]";
	}
}
