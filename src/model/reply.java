package model;

public class reply {
	private int uid ;
	private String discussion;
	private String lasttime;
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
	public String getLasttime() {
		return lasttime;
	}
	public reply(int uid, String discussion, String lasttime) {
		super();
		this.uid = uid;
		this.discussion = discussion;
		this.lasttime = lasttime;
	}
	
}
