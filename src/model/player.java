package model;

public class player {
	private String detail;
	private String time;
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getTime() {
		return time;
	}
	public player(String detail, String time) {
		super();
		this.detail = detail;
		this.time = time;
	}
}
