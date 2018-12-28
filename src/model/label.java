package model;

public class label {

	private int uid;
	private String iname;
	public label(int uid, String iname) {
		super();
		this.uid = uid;
		this.iname = iname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public label(String iname) {
		
		
		this.iname = iname;
	}
	
}
