package org.leadisteam.leadisjourney.api.rest.resources;

import org.leadisteam.leadisjourney.api.rest.models.CreateAccountModel;
import org.leadisteam.leadisjourney.api.rest.models.DeleteAccountModel;
import org.leadisteam.leadisjourney.api.rest.models.UpdateAccountModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {

	/*
	 * Method POST /account create a new account with pseudo/password/email
	 * 	@return account (tmp)
	 */
	@RequestMapping(method = RequestMethod.POST)
	public CreateAccountModel createAccount(@RequestBody CreateAccountModel account) {
		return account;
	}
	
	/* 
	 * Method DELETE account/id
	 * @return OK/KO (tmp true)
	*/
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE,headers="Accept=application/json")
	public boolean createAccount(@PathVariable int id, DeleteAccountModel account) {
		 return true;
	}
	
	/* 
	 * Method PUT userInformations/id + Body password
	 * @return boolean (tmp)
	*/
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT,headers="Accept=application/json")
	public boolean updateAccount(@PathVariable int id, @RequestBody UpdateAccountModel password) {
		 return true;
	}
}