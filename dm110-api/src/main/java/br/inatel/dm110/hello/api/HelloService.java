package br.inatel.dm110.hello.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public interface HelloService {


	@GET
	@Path("/calc/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result soma(@QueryParam("first") int num1,@QueryParam("last") int num2);
	
	@POST
	@Path("/calc/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result subtracao(@FormParam("first") int num1, @FormParam("last") int num2);

}
