package automation.testcases;


import automation.utilities.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PostCall {
	
	String response;
	String s;
	
	public String submitRequest(String addUserURI, String payload)
	{
		  response = RestAssured.given().log().all().baseUri(addUserURI)
				.header("Content-Type", "application/json")
				.body(payload).

				when().post(). 

				then().assertThat().statusCode(201).extract().response().asString();
		  
		  return response;

	}
	 
	@Parameters({"addUserURI", "addUserJsonPath","name", "job"})
	@Test
	public void testSuccessAddUserRequest(String addUserURI,String addUserJsonPath,String name,String job)
	{
		
       	final String payload = Payload.getAddUserPayLoad(addUserJsonPath, name, job); 
       	response = submitRequest(addUserURI, payload);
       	System.out.println(response);
       	
       	JsonPath js = new JsonPath(response);
       	
		 
        
		 
	}

}
