package model;

public class barrage {
	private int uid;
	private String discussion;
	private String time;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getDiscussion() {
		return discussion;
	}
	public void setDiscussion(String discussion) {
		this.discussion = discussion;
	}
	public String getTime() {
		return time;
	}
	public barrage(int uid, String discussion, String time) {
		super();
		this.uid = uid;
		this.discussion = discussion;
		this.time = time;
	}

}
