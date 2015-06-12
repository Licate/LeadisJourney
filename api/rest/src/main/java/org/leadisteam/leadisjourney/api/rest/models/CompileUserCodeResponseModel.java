package org.leadisteam.leadisjourney.api.rest.models;

public class CompileUserCodeResponseModel {
private boolean success;
private String[] errors;
private String[] warnings;

public CompileUserCodeResponseModel(){
}

public CompileUserCodeResponseModel(boolean success, String[] errors, String[] warnings){
	this.success = success;
	this.errors = errors;
	this.warnings = warnings;
}
public boolean isSuccess() {
	return success;
}
public void setSuccess(boolean success) {
	this.success = success;
}
public String[] getErrors() {
	return errors;
}
public void setErrors(String[] errors) {
	this.errors = errors;
}
public String[] getWarnings() {
	return warnings;
}
public void setWarnings(String[] warnings) {
	this.warnings = warnings;
}
}
