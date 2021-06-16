package com.Testcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.api.trace.StatusCode;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class Testexample {
	@Test
	public void test1() {
		
		Response Res = get("http://dummy.restapiexample.com/api/v1/employees");
		
		System.out.println(Res.getStatusCode());
		System.out.println(Res.getTime());
		System.out.println(Res.getBody().asString());
		
		int statuscode = Res.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		//Res.getStatusCode();
		//Res.getTime();
	}
	@Test
	public void test2() {
		
		given().
	      get("http://dummy.restapiexample.com/api/v1/employees").
		then().
		  statusCode(200);
	}

}
