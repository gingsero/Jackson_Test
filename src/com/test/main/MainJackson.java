package com.test.main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.main.vo.JsonObject;

public class MainJackson {
	public static String jsonData = "{\"result1\":\"test1\","
            + "\"result2\":\"test2\","
            + "\"result3\":[\"test3\",\"test4\"],"
            + "\"result4\":{\"subresult3\":\"test3\",\"subresult4\":\"test4\"}}";


	public MainJackson(){};
	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		JsonObject jObj = new JsonObject();
		try {
			jObj=  mapper.readValue(jsonData, JsonObject.class);
			
			System.out.println("jObj(JSON) : " + jObj);
			System.out.println("jObj(JSON) : " + jObj.getResult1());
			System.out.println("jObj(JSON) : " + jObj.getResult2());
			System.out.println("jObj(JSON) : " + jObj.getResult3());
			System.out.println("jObj(JSON) : " + jObj.getResult4());
			System.out.println("jObj(JSON) : " + jObj.getResult4().get("subresult3"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			String result = mapper.writeValueAsString(jObj);
			System.out.println("jObj(String) : " + result);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}	

}
