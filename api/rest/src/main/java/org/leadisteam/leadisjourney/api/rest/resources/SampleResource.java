package org.leadisteam.leadisjourney.api.rest.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("Sample")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
	@GET
	public String sample()
	{
		return "Test";
	}
	@POST
	public String yolo()
	{
		return ("chat");
	}
}
