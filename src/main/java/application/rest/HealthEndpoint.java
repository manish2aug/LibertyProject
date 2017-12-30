package application.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("app")
public class HealthEndpoint {

	@Inject
	private Main main;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response healthcheck() {

		/*
		 * if (!healthy) { return
		 * Response.status(503).entity("{\"status\":\"DOWN\"}").build(); }
		 */
		return Response.ok("{\"status\":\"UP\"}" + main.getProp()).build();
	}

}
