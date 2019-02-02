package MySQLProjectDemo.MySQLConnecting;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmpRepository {
	Connection con=null;
	public EmpRepository(){
		String url="jdbc:mysql://localhost:3306/restdb ?verifyServerCertificate=false&useSSL=false";
		String username="root";
		String password="ramu1234";
		try{
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,username,password);
		
		}	catch(Exception e){
					System.out.println(e);
				}
				}
	public List<EmployeesData> getEmployees(){
		List<EmployeesData> employees=new ArrayList<>();
		String sql="select *from restdb.parats";
		
		try{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
					while(rs.next()){
						/*EmployeesData emp=new EmployeesData();
						emp.setId(rs.getInt(1));
						emp.setName(rs.getString(2));
						emp.setLocation(rs.getString(3));
						return employees.add(emp);
						*/
						System.out.println(rs.getInt(1)+":"+rs.getString(2)+""+rs.getString(3));
					
						//con.close();
					 }
		 }catch(Exception e){
			System.out.println(e);
		}
		return employees;
	}
	public EmployeesData getEmployee(int id){
String sql="select *from restdb.parats where id"+id;
EmployeesData empl=new EmployeesData();
		
		try{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
					if(rs.next()){
						System.out.println(rs.getInt(1)+":"+rs.getString(2)+""+rs.getString(3));
					
						//con.close();
					 }
		 }catch(Exception e){
			System.out.println(e);
		}
		return empl;
	}
	
	public void creat(EmployeesData em){
		String sql="insert into restdb.parats values(?,?,?)";
		try{
			PreparedStatement st=con.prepareStatement(sql);
			st.executeUpdate();
			st.setInt(1, em.getId());
			st.setString(2, em.getName());
			st.setString(3, em.getLocation());
					
		 }catch(Exception e){
			System.out.println(e);
		}
		
	}
		
	}


