
public class Lesson {
	private Integer length; // in seconds
	private String text;
	private String videoUrl;
	private String title;
	
	public Lesson(Integer length, String text, String videoUrl, String title) {
		this.length = length;
		this.text = text;
		this.videoUrl = videoUrl;
		this.title = title;
	}
	
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Lesson [length=" + length + ", text=" + text + ", videoUrl=" + videoUrl + ", title=" + title + "]";
	}
	
}
