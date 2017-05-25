/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCON;

/**
 *
 * @author Pushpak Gandhi
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Vector;

import javax.servlet.http.HttpSession;

public class Data
{
	Connection con=null;
	ResultSet r=null;
	Statement s=null;
	PreparedStatement ps=null;
	public String msg="";
	private PreparedStatement P;
	private HttpSession ss;
        public Data()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentstuff","root","root");
			msg+="connected";
			s=con.createStatement();
		}catch(Exception e)
		{
			msg+=e.getMessage();
		}
		System.out.println(msg);
		
	}
     
	 public String getpswd(String uname) throws Exception
	 {
		 String str="";
		 r = null;
		 r = s.executeQuery("select * from tbladmin where admin_name = '"+uname+"'");
		 while(r.next())
		 {
			 str = r.getString(3);
		 }
		 return str;
	 }
	 
	 public ResultSet getusername(String uname) throws Exception
	 {
		 r = null;
		 r = s.executeQuery("select *  from tbladmin where admin_name = '"+uname+"'");
		return r;
	 }
         
                  
    public void setlogintime(Date createTime){
  try{
             ps=con.prepareStatement("insert into tbladmin(loginTime) values(?)");
                     ps.setDate(1, createTime);
                 ps.executeUpdate();}catch(Exception e){System.out.print(""+e);}
    }
    
 public String getAllData(String tbl,String url1,String url2)
{
String ans="<div>";
try
         {                                             
ps = con.prepareStatement("Select * from " + tbl);

r= ps.executeQuery();
while(r.next())
        {
            ans+="<tr>";
String id=r.getString(1);
String conf="confirm(\'Sure Want to Delete?\')";
for(int i=2;i<= r.getMetaData().getColumnCount();i++)

 ans+="<td valign=\"middle\">"+ r.getString(i)+" </td>";
String del="<a href ='"+ url1+"?id="+id+"' onclick=\" return "+ conf+"\">Delete</a>"   ;
String upd="<a href ='"+ url2+"?id="+id+"'>Edit</a>";
	
 
ans+="<td>"+ del+" </td>";
 ans+="<td>"+ upd+" </td>";
                   ans+="</tr>";  }
      }catch(Exception E)
          {
          msg=E.getMessage();
          }
ans+="</div>";
return ans;
}
 
 
 public void deleteBranch(int id)
	 {
		 try 
		 {
			s.execute("delete from tblbranch where intBranch_id ='"+id+"'");
		 } 
		 catch (SQLException e)
		 {
			e.printStackTrace();
		 }
	 }
 
 public String getBranch(String branch_id) throws Exception
	 {
		 String str="";
		 r = null;
		 r = s.executeQuery("select * from tblbranch where intBranch_id = '"+branch_id+"'");
		 while(r.next())
		 {
			 str = r.getString(2);
		 }
		 return str;
	 }
 
 public void insertBranch(String branch_name) throws SQLException{
  
             ps=con.prepareStatement("insert into tblBranch(strBranchName) values(?)");
                     ps.setString(1, branch_name);
                 ps.executeUpdate();
    }
 
 public void updateBranch(String branch_name, String id) throws Exception
	 {
		 s.executeUpdate("update tblbranch set strBranchName='"+branch_name+"' where intBranch_id='"+id+"'");

               // ps= con.prepareStatement("update tblbranch set strBranchName=? where intBranch_id="+id);
               // ps.setString(1, branch_name);
               // ps.executeUpdate();		
	 }
 public void insertCity(String city_name) throws SQLException{
  
             ps=con.prepareStatement("insert into tblCity(strCityName) values(?)");
                     ps.setString(1, city_name);
                 ps.executeUpdate();
    }
 public void updateCity(String city_name, String id) throws Exception
	 {
		 s.executeUpdate("update tblcity set strCityName='"+city_name+"' where intCity_id='"+id+"'");

               // ps= con.prepareStatement("update tblbranch set strBranchName=? where intBranch_id="+id);
               // ps.setString(1, branch_name);
               // ps.executeUpdate();		
	 }
 public void deleteCity(int id)
	 {
		 try 
		 {
			s.execute("delete from tblcity where intCity_id ='"+id+"'");
		 } 
		 catch (SQLException e)
		 {
			e.printStackTrace();
		 }
	 }
     public String getCity(String city_id) throws Exception
	 {
		 String str="";
		 r = null;
		 r = s.executeQuery("select * from tblcity where intCity_id = '"+city_id+"'");
		 while(r.next())
		 {
			 str = r.getString(2);
		 }
		 return str;
	 }
          
    
     public String getAllMembers(String tbl,String url1,String url2)
{
String ans="<div>";
try
         {                                             
ps = con.prepareStatement("Select user_name,first_name,last_name from " + tbl);

r= ps.executeQuery();
while(r.next())
        {
            ans+="<tr>";
String id=r.getString(1);
String conf="confirm(\'Sure Want to Delete?\')";
for(int i=1;i<= r.getMetaData().getColumnCount();i++)

 ans+="<td valign=\"middle\">"+ r.getString(1)+" </td>";
String del="<a href ='"+ url1+"?id="+id+"' onclick=\" return "+ conf+"\">Delete</a>"   ;
String upd="<a href ='"+ url2+"?id="+id+"'>Edit</a>";
	
 
ans+="<td>"+ del+" </td>";
 ans+="<td>"+ upd+" </td>";
                   ans+="</tr>";  }
      }catch(Exception E)
          {
          msg=E.getMessage();
          }
ans+="</div>";
return ans;
}
     
     public ResultSet getregister() throws Exception
	 {
		 r= null;
		 r = s.executeQuery("select * from tblmembers");
		 return r;
	 }
     public ResultSet getSelectedUser(String user_id) throws Exception
	 {
		 r= null;
		 r = s.executeQuery("select * from tblmembers where member_id="+user_id);
		 return r;
	 }
     
       public void userBlock(int user_id) throws SQLException{
  
              s.executeUpdate("update tblmembers set activation=0 where member_id ='"+user_id+"'");
    }
     
     
}