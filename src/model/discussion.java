package model;

public class discussion {
	
	private String discussion;
	private String lasttime;
	private String uname;
	public discussion(String discussion, String lasttime, String uname) {
		super();
		this.discussion = discussion;
		this.lasttime = lasttime;
		this.uname = uname;
	}
	public String getDiscussion() {
		return discussion;
	}
	public void setDiscussion(String discussion) {
		this.discussion = discussion;
	}
	public String getLasttime() {
		return lasttime;
	}
	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
}
