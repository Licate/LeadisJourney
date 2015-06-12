package org.leadisteam.leadisjourney.api.services;

import org.junit.Before;
import org.junit.Test;
import org.leadisteam.leadisjourney.api.core.CompileResponse;

import static org.junit.Assert.*;

public class CodeServiceTest {
    private final String ValidUserCode = "int main() { printf(\"test\\n\"); return 0; }";
    private final String InValidUserCode = "I'm devil code !";
    private CodeService codeService;

    @Before
    public void Setup() {
        this.codeService = new CodeService();
    }

    @Test
    public void GivenValidUserCodeWhenCompileThenShouldReturnSuccess() {
        CompileResponse response = this.codeService.compileUserCode(ValidUserCode);

        assertTrue(response.isSuccess());
    }

    @Test
    public void GivenInValidUserCodeWhenCompileThenShouldReturnSuccessToFalse() {
        CompileResponse response = this.codeService.compileUserCode(InValidUserCode);

        assertFalse(response.isSuccess());
    }
}
