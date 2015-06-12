package org.leadisteam.leadisjourney.api.core;

public class CompileResponse {
	private boolean success;
	private String[] warnings;
	private String[] errors;
	
	public String[] getWarnings() {
		return warnings;
	}
	public void setWarnings(String[] warnings) {
		this.warnings = warnings;
	}
	public String[] getErrors() {
		return errors;
	}
	public void setErrors(String[] errors) {
		this.errors = errors;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}
