package com.java.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@ExtendWith(ValidateParameterResolver.class)
@RunWith(JUnitPlatform.class)
class Testing1 {
	@Test
	@Tag("my-tag")
	 void test( Class at) {
		Assertions.assertTrue(at.Validate("Suba", "Suba17"));
	  
	 }
}