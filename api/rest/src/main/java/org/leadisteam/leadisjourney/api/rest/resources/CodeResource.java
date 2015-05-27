package org.leadisteam.leadisjourney.api.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.leadisteam.leadisjourney.api.rest.models.CompileUserCodeModel;
import org.leadisteam.leadisjourney.api.rest.models.CompileUserCodeResponseModel;

@Path("code")
@Produces(MediaType.APPLICATION_JSON)
public class CodeResource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response compileUserCode(CompileUserCodeModel model) {
		String[] err = new String[2];
		err[0] = "error num 1";
		err[1] = "error num 2";
		CompileUserCodeResponseModel resp = new CompileUserCodeResponseModel(false, err, new String[0]);
		
		return Response.status(200).entity(resp).build();
	}
}
