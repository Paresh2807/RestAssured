package com.Testcode;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutpatchDelete {
	
	@Test
	public void Test_2() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		JSONObject request = new JSONObject();
	
		
		request.put("name","Paresh");
		request.put("job","QE");
		
		System.out.println(request.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		
	given().
	header("Content-Type", "application/json").
	contentType(ContentType.JSON).accept(ContentType.JSON).
	   body(request.toJSONString()).
	 when().
	   patch("/users/2").
	 then().statusCode(200).log().all();
		 
		 
		

		
		
	}
	@Test
	public void Test_3() {
		
		
	
	 when().
	   delete("https://reqres.in/api/users/2").
	 then().statusCode(204).log().all();
		 
		 
		

		
		
	}

}
