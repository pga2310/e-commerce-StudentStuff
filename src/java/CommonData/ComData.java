package CommonData;


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

public class ComData
{
	Connection con=null;
	ResultSet r=null;
	Statement s=null;
	PreparedStatement ps=null;
	public String msg="";
	private PreparedStatement P;
	private HttpSession ss;
        public ComData()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentstuff","root","root");
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
		 r = s.executeQuery("select * from tblmembers where user_name = '"+uname+"'");
		 while(r.next())
		 {
			 str = r.getString(3);
		 }
		 return str;
	 }
         
         public String getuserId(String uname) throws Exception
	 {
		 String str="";
		 r = null;
		 r = s.executeQuery("select member_id from tblmembers where user_name = '"+uname+"'");
		 while(r.next())
		 {
			 str = r.getString(1);
		 }
		 return str;
	 }
	 
	 public ResultSet getusername(String uname) throws Exception
	 {
		 r = null;
		 r = s.executeQuery("select *  from tblmembers where user_name = '"+uname+"'");
		 return r;
	 }
         
         
         
         
         public ResultSet getmaterial() throws Exception
	 {
		 r = null;
		 r = s.executeQuery("select *  from tblmaterial");
		 return r;
	 }
          public ResultSet getselectedmaterial(String item_id) throws Exception
	 {
		 r = null;
		 r = s.executeQuery("select *  from tblmaterial where idtblmaterial='"+item_id+"'");
		 return r;
	 }
          
         public void register(String f_name,String l_name,String gender,String address,String city,String college,String branch,String mobile,String email,String password,String image) throws Exception
	 { 
		 s.executeUpdate("insert into tblmembers(first_name,last_name,sex,address,city,college_name,branch,mobile,email_id,password,photo_url) values('"+f_name+"','"+l_name+"','"+gender+"','"+address+"','"+city+"','"+college+"','"+branch+"','"+mobile+"','"+email+"','"+password+"','"+image+"')");
	 }
         
         public ResultSet getAllStuff() throws Exception
	 {
		
                 r = null;
		 r = s.executeQuery("select *  from tblitemlisted");
		 return r;
	 }
         
          public ResultSet getAllfield() throws Exception
	 {
		 r = null;
		 r = s.executeQuery("select strFieldName from tblfield");
		 return r;
	 }
          
          public ResultSet getregister(String uname) throws Exception
	 {
		 r= null;
		 r = s.executeQuery("select * from tblmembers where user_name='"+uname+"'");
		 return r;
	 }
          
          public void itemAdd(String title,String tagline,String description,String price,String city,String field,String category,String condition,String img1,String img2) throws Exception
	 { 
		 s.execute("insert into tblitemlisted(strTitle,tagline,strDescription,decPrice,city,field,category,condition,strImage1,strImage2) values('"+title+"','"+tagline+"','"+description+"','"+price+"','"+city+"','"+field+"','"+category+"','"+condition+"',"+img1+",'"+img2+"')");
	 }
          
          public void NewitemAdd(String title,String tagline,String description,String price,String city,String field,String category,String condition,String img1,String img2,String id,String date) throws Exception
	 { 
		 
                 ps=con.prepareStatement("insert into tblitemlisted(strTitle,tagline,strDescription,decPrice,city,field,category,condition,strImage1,strImage2,id,date) values(?,?,?,?,?,?,?,?,?,?,?,?)");
                 ps.setString(1, title);
                 ps.setString(2, tagline);
                 ps.setString(3, description);
                 ps.setString(4, price);
                 ps.setString(5, city);
                 ps.setString(6, field);
                 ps.setString(7, category);
                 ps.setString(8, condition);
                 ps.setString(9, img1);
                 ps.setString(10, img2);
                 ps.setString(11, id);
                 ps.setString(12, date);
                 ps.executeUpdate();
                 
                 
                 
         
         }
          public ResultSet getuserItemListed(String uid) throws Exception
	 {
		 r= null;
		 r = s.executeQuery("select * from tblitemlisted where intSeller_id='"+uid+"'");
		 return r;
	 }
           public ResultSet getwishlist(String uid) throws Exception
	 {
		 r= null;
		 r = s.executeQuery("select * from tblwishlist where intmember_id='"+uid+"'");
		 return r;
	 }
              
           
            public void addWishList(int id,String item_name,String req_details, String date) throws Exception
	 { 
		 s.execute("insert into tblwishlist(intmember_id,strTitle,strRequirementDetails,dtmDateofWishList) values('"+id+"','"+item_name+"','"+req_details+"','"+date+"')");
	 }
           
            public void deleteWishListItem(String id)
	 {
		 try 
		 {
			s.execute("delete from tblwishlist where strTitle ='"+id+"'");
		 } 
		 catch (SQLException e)
		 {
			e.printStackTrace();
		 }
	 }
            
            
            public ResultSet getListofUploadedItem(int uid) throws Exception
	 {
		 r= null;
		 r = s.executeQuery("select * from tblmaterial where intmember_id='"+uid+"'");
		 return r;
	 }
            
            public ResultSet getcmnt() throws Exception
	 {
		
		 
                 r = null;
		 int i=0;
		 ResultSet r1 = null;
		 r1 = s.executeQuery("select count(indx) from tbldiscussion");
		 if(r1.next())
		 {
			
			 i = r1.getInt(1);
			
		 }
		 r1.close();
		 if(i>20)
		 {
		 r = s.executeQuery("SELECT * FROM tbldiscussion");
		 
		 }
		 else
			 {
			 r = s.executeQuery("SELECT * FROM tbldiscussion");
			 }
	 return r;
	 }
            
            public void insertComment(String uname, String comment, String dat) throws Exception
	 {
		 r = null;
		 s.execute("insert into tbldiscussion(user_name,comment,date) values('"+uname+"','"+comment+"','"+dat+"')");
	 }
            
            public ResultSet commentUserIDPic(String uname) throws Exception
	 {
		 r = null;
		 s.executeQuery("select photo_url from tblmembers where user_name='"+uname+"'");
                 return r;
         }
            
            
            public ResultSet EditProfile(int uid) throws Exception
	 {
		 r = null;
		 s.executeQuery("select * from tblmembers where member_id='"+uid+"'");
                 return r;
         }
            
            public void UploadMaterial(String path,String tagline,String description,String date,String id,String title,String img) throws Exception
	 {
		 r = null;
		 s.execute("insert into tblmaterial(url,strmaterial_descr,strmaterial_brief_descr,dtm_posting,intmember_id,title,img) values('"+path+"','"+tagline+"','"+description+"','"+date+"','"+id+"','"+title+"','"+img+"')");
	 }
            
             public void deleteUploadedMaterial(String id)
	 {
		 try 
		 {
			s.execute("delete from tblmaterial where idtblmaterial ='"+id+"'");
		 } 
		 catch (SQLException e)
		 {
			e.printStackTrace();
		 }
	 }
             
             
             public ResultSet NewsStuff() throws Exception
	 {
		 r = null;
		 s.executeQuery("select * from tblitemlisted");
                 return r;
         }
          public ResultSet NewsMaterial() throws Exception
	 {
		 r = null;
		 s.executeQuery("select * from tblmaterial");
                 return r;
         } 
}
   