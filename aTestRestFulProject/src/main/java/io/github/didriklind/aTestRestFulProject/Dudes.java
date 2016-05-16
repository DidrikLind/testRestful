package io.github.didriklind.aTestRestFulProject;


import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/theDudes")
public class Dudes {

	List <Dude> dudeList = new ArrayList<>();
	
	public Dudes() {
		
		//fake database
		dudeList.add(new Dude(1, "Didrik", "Lind", 23, "Martial Arts"));
		dudeList.add(new Dude(2, "Trädet", "Björk", 1000, "Blomstra"));
		dudeList.add(new Dude(3, "Göteborg", "Stad", 200, "Urbanisera"));	
		
	}
	
	/*WITH RESOURCE PATHING------------------------------------------------------*/
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public List<Dude> getAllDudes() {
//		return dudeList;
//		//EX:
//		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	@Path("/{aDudeIndex}")
//	public Dude getDude(@PathParam("aDudeIndex") int index) {
//		return dudeList.get(index);
//		//EX:
//		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes/1
//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dude> getAllDudes() {
		return dudeList;
		//EX:
		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{aDudeIndex}")
	public Dude getDude(@PathParam("aDudeIndex") int index) {
		if(index > dudeList.size()-1)
			return null;
		return dudeList.get(index);
		//EX:
		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes/1
	}	
	
	/*WITH RESOURCE PATHING------------------------------------------------------*/

	
	/*WITH QUERYSTRINGS------------------------------------------------------*/
	
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public List<Dude> getAllDudesWithQueryString(@QueryParam("getDudes") boolean wantList) {
//		if(wantList) {
//			return dudeList;
//		}
//		return null;
//		//EX:
//		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes?getDudes=true
//	}	
//	
//	@GET
//	@Path("/dude")
//	@Produces(MediaType.APPLICATION_XML)
//	public Dude getDudeWithQueryString(@QueryParam("aDudeIndex") int index) {
//		return dudeList.get(index);
//		//EX:
//		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes/dude?aDudeIndex=1
//	}
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Dude> getAllDudesWithQueryString(@QueryParam("getDudes") boolean wantList) {
//		if(wantList) {
//			return dudeList;
//		}
//		return null;
//		//EX:
//		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes?getDudes=true
//	}	
//	
//	@GET
//	@Path("/dude")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Dude getDudeWithQueryString(@QueryParam("aDudeIndex") int index) {
//		return dudeList.get(index);
//		//EX:
//		//http://localhost:8080/aTestRestFulProject/didrikswebapi/theDudes/dude?aDudeIndex=1
//	}	
	
	/*WITH QUERYSTRINGS------------------------------------------------------*/
	
}
