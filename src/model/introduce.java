package model;

public class introduce {
	private int uid ;
	private String abstracts;
	private  String img ;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public introduce(int uid, String abstracts, String img) {
		super();
		this.uid = uid;
		this.abstracts = abstracts;
		this.img = img;
	}
	
	
	
	
}
