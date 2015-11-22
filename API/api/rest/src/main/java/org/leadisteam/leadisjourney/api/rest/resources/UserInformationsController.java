package org.leadisteam.leadisjourney.api.rest.resources;

import org.leadisteam.leadisjourney.api.rest.models.GetUserInformationsModel;
import org.leadisteam.leadisjourney.api.rest.models.UpdateUserInformationsModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserInformationsController {
	
	/* 
	 * Method PUT user/id + Body name/firstName/avatar
	 * @return infos (tmp)
	*/
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT,headers="Accept=application/json")
	public UpdateUserInformationsModel updateUserInformations(@PathVariable int id, @RequestBody UpdateUserInformationsModel infos) {
		 return infos;
	}
	
	/* 
	 * Method GET user/id
	 * @return boolean (tmp)
	*/
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public boolean getUserInformations(@PathVariable int id, GetUserInformationsModel infos) {
		 return true;
	}
}
