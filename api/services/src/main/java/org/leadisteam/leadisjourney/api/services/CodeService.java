package org.leadisteam.leadisjourney.api.services;

import org.leadisteam.leadisjourney.api.core.CompileResponse;
import org.leadisteam.leadisjourney.api.core.CompileService;

import java.util.UUID;

public class CodeService {
	public CompileResponse compileUserCode(String userCode) {
		CompileService compileService = new CompileService(UUID.randomUUID(), userCode);
		CompileResponse response = compileService.compile();
		return response;
	}
}
