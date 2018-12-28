package Server;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

















import Server.connect;



import model.User;
import model.discussion;
import model.label;
import model.manage;



     public class server {
    	
    	 ObjectInputStream ois;
    	 ObjectOutputStream oos;
    	 Socket s;
    	 protected static ResultSet rs;
    	 private final static int showNum = 15;
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
    		final int send= 2222;
    		final int managelogin= 1017;
    		private final static int fieldNum = 9;
    	 public server() throws Exception {
    		 ServerSocket ss = new ServerSocket(9998);
    		  while(true){
    			  
    			  s = ss.accept();
    				ois = new ObjectInputStream(s.getInputStream());
    				oos = new ObjectOutputStream(s.getOutputStream());
    				int command = ois.readInt();
    				if (command == LOGIN) {
    					Login();
    					
    				}if (command == send) {
    					send();
    				}
    				
    				if (command == managelogin) {
    					managelogin();
    				}
    				if (command == ZHUCE) {
    					zhuce();
    				}
    				if (command == reply) {
    					reply();
    				}

    				if (command == updatePersonal) {
    					Personal();
    				}
                    if (command == sanddiscussion){
                    	sanddiscussion();
                    }
                    if (command == increaselabe){
                    	increaselabe();
                    }
                    if (command == queryByName){
                    	queryByName(null);
                    }
                    if (command == guanzhu){
                    	guanzhu();
                    }
                    if (command == deletuser){
                    	deletuser();
                    }
                    if (command == deletlabe){
                    	deletlabe();
                    }
    				
    		  }	  
    		 
    	 }
 	
    		
    		public void Login() throws IOException, ClassNotFoundException, SQLException{
    			
    		String uemail=	ois.readUTF();
    		String upw = 	ois.readUTF();
    		
    		User u =null;
    		String sql = "select * from user where uemail='" + uemail + "'and'"+ upw +"'";
    		ResultSet rs = connect.getConn().executeQuery(sql);
    		if(rs.next())
    			u = new User(rs.getString(1),rs.getString(2));
    		   oos.writeObject(u);
    		   oos.flush();
    		
    		}
    		
    		public void managelogin() throws IOException, ClassNotFoundException, SQLException{
    			
    			manage u = null;
    			String name = ois.readUTF();
    			String pw = ois.readUTF();
    			String sql = "select * from manage where name='" + name + "' and pw ='"
    					+ pw + "'";
    			ResultSet rs = connect.getConn().executeQuery(sql);
    			if (rs.next())
    				u = new manage(rs.getString(1), rs.getString(2), rs.getInt(3));
    			oos.writeObject(u);
    			oos.flush();
        		
        		}
    		
    		
    		
    		public void zhuce() throws IOException{
    			
    			
        		String uemail=	ois.readUTF();
        		String upw = 	ois.readUTF();
        		String uphone = 	ois.readUTF();
        		String uname = ois.readUTF();
        		User u =null;
        		String sql = "insert into user(uemail,upw,uname,uphone) values('"+uemail+"','"+upw+"','"+uname+",''"+uphone+"')";
        		try {
					connect.getConn().executeUpdate(sql);
					oos.writeObject(new User (uemail,upw,uphone));
				} catch (SQLException e) {
					oos.writeObject(null);
					oos.flush();
				
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
    		}
    		
    		
    		
    		public void send() throws Exception {
    			User u = (User) ois.readObject();
    			
    			String discussion = ois.readUTF();
    			String sql = "insert into discussion values('"
    					+ u.getUname() + "','" + discussion + "','" + new Date() + "')";
    			connect.getConn().executeUpdate(sql);
    			
    		}
    		
    		
	public void Personal() throws Exception{
    			
    			String uname=ois.readUTF();
        		String uemail=	ois.readUTF();
        		String upw = 	ois.readUTF();
        		String uphone = 	ois.readUTF();
        		
        		User u =null;
        	
        		 if(false == uphone.equals(uphone)) {
        	            String sql = "update user set uname='"+uname+"' where uemail='"+uemail+"'";
        	            String[] param = {u.getUmail(),u.getUname(),u.getUphone(),u.getUpw() };
        	            try {
        	            	connect.getConn().executeUpdate(sql,param);
        					oos.writeObject(new User (uphone, uemail));
        				} catch (SQLException e) {
        					oos.writeObject(null);
        					oos.flush();
        				
        					e.printStackTrace();
        				} catch (ClassNotFoundException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
        	        }
        		 if(false == upw.equals(upw)){
              		String sql = "update user set upw='"+upw+"' where email='"+uemail+"'";
              		 String[] param = {u.getUmail(),u.getUname(),u.getUphone(),u.getUpw() };
              		try {
              			connect.getConn().executeUpdate(sql,param);
      					oos.writeObject(new User (upw, uemail));
      				} catch (SQLException e) {
      					oos.writeObject(null);
      					oos.flush();
      				
      					e.printStackTrace();
      				} catch (ClassNotFoundException e) {
      					// TODO Auto-generated catch block
      					e.printStackTrace();
      				}
              		
              		}
        		 if(false == uname.equals(uname)){
             		String sql = "update user set uphone='"+uphone+"' where email='"+uemail+"'";
             		 String[] param = {u.getUmail(),u.getUname(),u.getUphone(),u.getUpw() };
             		try {
             			connect.getConn().executeUpdate(sql,param);
     					oos.writeObject(new User (uname, uemail));
     				} catch (SQLException e) {
     					oos.writeObject(null);
     					oos.flush();
     				
     					e.printStackTrace();
     				} catch (ClassNotFoundException e) {
     					// TODO Auto-generated catch block
     					e.printStackTrace();
     				}
             		
             		}	 
        		
    		}

	public void sanddiscussion()throws IOException, SQLException, ClassNotFoundException {
		String sql = "select * from discussion";
		ResultSet rs = connect.getConn().executeQuery(sql);
		String string = "";
		while (rs.next()) {
			string += rs.getString("uname")
					+ rs.getString("discussion")
					+ "/" + rs.getString("lasttime");
			string += "\n";
		}
		oos.writeUTF(string);
		oos.flush();

	}
	
	public void reply() throws Exception {
		User u = (User) ois.readObject();
		String discussion = ois.readUTF();
		String sql = "insert into reply(uname,discussion,lasttime) values('" + u.getUname() + "','" + discussion + "','" + new Date() + "')";

		connect.getConn().executeUpdate(sql);

	}
	
	public void increaselabe() throws IOException{
		
		
		String iname=	ois.readUTF();
		
		label u =null;
		String sql = "insert into lable(iname) values('"+iname+"')";
		
		try {
			connect.getConn().executeUpdate(sql);
			oos.writeObject(new label (iname));
		} catch (SQLException e) {
			oos.writeObject(null);
			oos.flush();
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void guanzhu() throws Exception{
		
		
		String fance=	ois.readUTF();
		String uname=	ois.readUTF();
		
		User u =null;
		String sql = "update user set fance=fance+1 where fance>1 and uname='"+uname+"' ";
		 String[] param = {u.getUmail(),u.getUname(),u.getUphone(),u.getUpw() };
		try {
			connect.getConn().executeUpdate(sql,param);
			oos.writeObject(new User (fance));
		} catch (SQLException e) {
			oos.writeObject(null);
			oos.flush();
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void deletuser() throws Exception{
		
		
		String uemail=	ois.readUTF();
		
		User u =null;
		String sql = "delete from user where uemail='"+uemail+"'";
		 String[] param = {u.getUmail(),u.getUname(),u.getUphone(),u.getUpw() };
		try {
			connect.getConn().executeUpdate(sql,param);
			oos.writeObject(new User (uemail));
		} catch (SQLException e) {
			oos.writeObject(null);
			oos.flush();
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
public void deletlabe() throws IOException{
		
		
		String iname=	ois.readUTF();
		
		label u =null;
		String sql = "delete from lable where iname='"+iname+"';";
		String[] param = {u.getIname()};
		try {
			connect.getConn().executeUpdate(sql,param);
			oos.writeObject(new label(iname));
		} catch (SQLException e) {
			oos.writeObject(null);
			oos.flush();
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
public static String[][] queryByName(String uname) throws Exception {
	String[][] result = null;
	if (uname.length() < 0) {
		return result;
	}
	List<User> us = new ArrayList<User>();
	int i = 0;
	String sql = "select * from user where uname like ?";
	String[] param = { "%" + uname + "%" };
	   connect.getConn().executeUpdate(sql,param);
	try {
		while (rs.next()) {
			buildList(rs, us, i);
			i++;
		}
		if (us.size() > 0) {
			result = new String[us.size()][fieldNum];
			for (int j = 0; j < us.size(); j++) {
				buildResult(result, us, j);
			}
		}
	} catch (SQLException se) {
		se.printStackTrace();
	} finally {
		destroy();
	}

	return result;
}

protected static void destroy() {
	try {
		if (rs != null) {
			rs.close();
		}
	} catch (SQLException se) {
		se.printStackTrace();
	}
}

public static String[][] list(int pageNum) throws Exception {
	String[][] result = null;
	if (pageNum < 1) {
		return result;
	}
	List<User> us = new ArrayList<User>();
	int i = 0;
	int beginNum = (pageNum - 1) * showNum;
	String sql = "select * from user limit 0,4";
	Integer[] param = { beginNum, showNum };
	 connect.getConn().execute(sql);
	try {
		while (rs.next()) {
			buildList(rs, us, i);
			i++;
		}
		if (us.size() > 0) {
			result = new String[us.size()][fieldNum];
			for (int j = 0; j < us.size(); j++) {
				buildResult(result, us, j);
			}
		}
	} catch (SQLException se) {
		se.printStackTrace();
	} finally {
		destroy();
	}

	return result;
}

private static void buildList(ResultSet rs, List<User> list, int i) throws Exception {
	User u = null;
	u.setUid(i+1);
	u.setUname(rs.getString("uname"));
	u.setUmail(rs.getString("uemail"));
	u.setFance(rs.getString("fance"));
	u.setUphone(rs.getString("uphone"));
	u.setUpw(rs.getString("upw"));
	
	list.add(u);
}

private static void buildResult(String[][] result, List<User> us, int j) throws Exception {
	User u = us.get(j);
	result[j][0] = String.valueOf(u.getUid());
	result[j][1] = u.getUname();
	result[j][2] = u.getUmail();
	result[j][3] = u.getFance();
	result[j][4] = u.getUphone();
	result[j][5] = u.getUpw();
}




	
	
    		public static void main(String[]args) throws Exception{
    			 
    			try {
					new server();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			
    			
    		} 
    	
        	
        	 }
    	 
    