package model;

public class vedio {
	private int uid;
	private String jianjie;
	private int good;
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public vedio(int good) {
		super();
		this.good = good;
	}
	public vedio(int uid, String jianjie) {
		super();
		this.uid = uid;
		this.jianjie = jianjie;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getJianjie() {
		return jianjie;
	}
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	

	
	
	
	
	
	
}
