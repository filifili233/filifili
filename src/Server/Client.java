package Server;

import java.io.*;
import java.net.*;

import model.User;
import model.manage;

public class Client {
    ObjectOutputStream oos;
    ObjectInputStream ois;
    
    final int LOGIN = 1001;
	final int ZHUCE = 1002;
	final int updatePersonal = 1003;
	final int sanddiscussion= 1004;
	final int increaselabe =1005;
	final int guanzhu = 1006;
	final int deletuser =1007;
	final int deletlabe=1008;
	final int reply=1009;
	final int queryByName= 1010;
	final int managelogin= 1017;
	final int send= 2222;
	Socket s;
	public Client() throws UnknownHostException, IOException{
		//Socket s = new Socket("10.51.160.106",9991);
		Socket s = new Socket("127.0.0.1",9998);
		oos = new  ObjectOutputStream(s.getOutputStream());
		ois = new  ObjectInputStream(s.getInputStream());
		
	}
	
public manage deletuser(String uemail,String uid) throws IOException, ClassNotFoundException{
		
		oos.writeInt(deletuser);
		oos.flush();
		
		oos.writeUTF(uemail);
		oos.flush();
		
		oos.writeUTF(uid);
		oos.flush();
		return (manage) ois.readObject();
		
	}
	

	public User Personal(String uname,String upw,String uphone) throws IOException, ClassNotFoundException{
		
		oos.writeInt(updatePersonal);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		
		oos.writeUTF(upw);
		oos.flush();
		oos.writeUTF(uphone);
		oos.flush();
		
		return (User) ois.readObject();
		
	}
	


public User reply(String uname,String uemail,String discussion,String lasttime) throws IOException, ClassNotFoundException{
		
		oos.writeInt(reply);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(discussion);
		oos.flush();
		oos.writeUTF(lasttime);
		oos.flush();
		
		return (User) ois.readObject();
		
	}
	
	
	public  manage managelogin(String uid,String pw) throws IOException, ClassNotFoundException{
		
		oos.writeInt(managelogin);
		oos.flush();
		oos.writeUTF(uid);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		return (manage) ois.readObject();
		
	}
public User Login(String uemail,String upw) throws IOException, ClassNotFoundException{
		
		oos.writeInt(LOGIN);
		oos.flush();
		oos.writeUTF(uemail);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		return (User) ois.readObject();
		
	}

	public manage increaselabe(String iname) throws IOException, ClassNotFoundException{
		
		oos.writeInt(increaselabe);
		oos.flush();
		oos.writeUTF(iname);
		oos.flush();
		
		return (manage) ois.readObject();
		
	}
	public manage deletlabe(String iname) throws IOException, ClassNotFoundException{
		
		oos.writeInt(deletlabe);
		oos.flush();
		oos.writeUTF(iname);
		oos.flush();
	
		return (manage) ois.readObject();
		
	}
	public User zhuce(String uemail,String upw,String uname,String uphone) throws IOException, ClassNotFoundException{
		
		oos.writeInt(ZHUCE);
		oos.flush();
		oos.writeUTF(uemail);
		oos.flush();
		oos.writeUTF(upw);
		oos.flush();
		oos.writeUTF(uname);
		oos.flush();
		oos.writeUTF(uphone);
		oos.flush();
		return (User) ois.readObject();
		
	}
	
	
	public void send(User u, String discussion) throws IOException {
		oos.writeInt(send);
		oos.flush();
		oos.writeObject(u);
		oos.flush();
		oos.writeUTF(discussion);
		oos.flush();
	}
	
	

	public String sanddiscussion() throws IOException {
		oos.writeInt(sanddiscussion);
		oos.flush();
		return ois.readUTF();
	}
}
