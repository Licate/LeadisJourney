package org.leadisteam.leadisjourney.api.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.leadisteam.leadisjourney.api.core.CompileResponse;
import org.leadisteam.leadisjourney.api.rest.models.CompileUserCodeModel;
import org.leadisteam.leadisjourney.api.rest.models.CompileUserCodeResponseModel;
import org.leadisteam.leadisjourney.api.services.CodeService;

@Path("code")
@Produces(MediaType.APPLICATION_JSON)
public class CodeResource {
    private final CodeService codeService;

    public CodeResource() {
        this.codeService = new CodeService();
    }

    @POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response compileUserCode(CompileUserCodeModel model) {
        CompileResponse response =  this.codeService.compileUserCode(model.getCode());
		CompileUserCodeResponseModel resp = new CompileUserCodeResponseModel(response.isSuccess(), response.getErrors(), response.getWarnings());
		
		return Response.status(200).entity(resp).build();
	}
}
