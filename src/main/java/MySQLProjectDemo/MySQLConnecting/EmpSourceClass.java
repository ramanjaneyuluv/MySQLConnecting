package MySQLProjectDemo.MySQLConnecting;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Path("/employees")
public class EmpSourceClass {
	EmpRepository repo=new EmpRepository();
	
	@GET
	@Path("/emp")
	@Produces(MediaType.APPLICATION_XML)
	public List<EmployeesData> getEmployees(){
		System.out.println("get Employees called");
		return repo.getEmployees();
	}
	
	@GET
	@Path("/emp/{id}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public EmployeesData getEmployee(@PathParam("id") int id){
		return repo.getEmployee(id);
		
	}
	@POST
	@Path("/empl")
	@Produces(MediaType.APPLICATION_XML)
	public EmployeesData createEmployee(EmployeesData em){
		System.out.println(em);
		repo.creat(em);
		return em;
	}

}
