package model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int uid;
	private String umail;
	private String uname;
	private String upw;
	private int ucoin;
	private int grade;
	private String uphone;
	private int type;
	private String img;
	private boolean islogin;
	private String fance;
	private int guanzhu;
	public String getFance() {
		return fance;
	}
	public void setFance(String fance) {
		this.fance = fance;
	}
	public int getGuanzhu() {
		return guanzhu;
	}
	public void setGuanzhu(int guanzhu) {
		this.guanzhu = guanzhu;
	}
	public User(String fance, int guanzhu) {
		super();
		this.fance = fance;
		this.guanzhu = guanzhu;
	}
	public User(String umail,String upw,String uphone){
		islogin = false;
	}
	public User(String umail,String upw){
		islogin = false;
	}
	public User(int uid, String umail, String uname, String upw, int ucoin,
			int grade, String uphone, int type, String img) {
		super();
		this.uid = uid;
		this.umail = umail;
		this.uname = uname;
		this.upw = upw;
		this.ucoin = ucoin;
		this.grade = grade;
		this.uphone = uphone;
		this.type = type;
		this.img = img;
		islogin=true;
	}
	public User(String fance) {
		this.fance = fance;
	}
	public int getUid() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return uid;
	}
	public void setUid(int uid) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.uid = uid;
	}
	public String getUmail() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return umail;
	}
	public void setUmail(String umail) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.umail = umail;
	}
	public String getUname() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return uname;
	}
	public void setUname(String uname) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.uname = uname;
	}
	public String getUpw() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return upw;
	}
	public void setUpw(String upw) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.upw = upw;
	}
	public int getUcoin() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return ucoin;
	}
	public void setUcoin(int ucoin) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.ucoin = ucoin;
	}
	public int getGrade() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return grade;
	}
	public void setGrade(int grade) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.grade = grade;
	}
	public String getUphone() throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		return uphone;
	}
	public void setUphone(String uphone) throws Exception {
		if(!islogin)
			throw new Exception("没有登录！");
		this.uphone = uphone;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	

	
}
