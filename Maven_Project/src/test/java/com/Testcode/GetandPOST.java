package com.Testcode;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class GetandPOST {
	
	@Test
	public void Test_1() {
		
		baseURI = "https://reqres.in/api";
		
		given().
		 get("/users?page=2").
		then().
		 statusCode(200).
		body("data[0].first_name",equalTo("Michael")).
		body("data.first_name",hasItem("Michael"));
	}
		
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
		   post("/users").
		 then().statusCode(201).log().all();
			 
			 
			
	
			
			
		}
		
		
	}


