package com.jdaasjson.jdaasjson;
import java.io.File;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("api/message")
public class TestController {

    @GetMapping("/hello")
    public ResponseEntity<String> get()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        String testJson = "{\n" + "  \"user\": {\n" + "    \"0\": {\n" + "      \"firstName\": \"Monica\",\n" + "      \"lastName\": \"Belluci\"\n" + "    },\n" + "    \"1\": {\n" + "      \"firstName\": \"John\",\n" + "      \"lastName\": \"Smith\"\n" + "    },\n" + "    \"2\": {\n" + "      \"firstName\": \"Owen\",\n" + "      \"lastName\": \"Hargreaves\"\n" + "    }\n" + "  }\n" + "}";
        String result="";
        try {
            User readValue  = mapper.readValue(testJson, User.class);
            if(readValue!=null)
            result= "Result:"+readValue.getUser().get("0").getFirstName();
            else
            result="Bad";
        } catch (JsonMappingException e) {
           
            e.printStackTrace();
            return ResponseEntity.ok("Hello My First Spring Boot Project. Well Done ID"+ e.getMessage());
         
        } catch (JsonProcessingException e) {
            
            e.printStackTrace();
            return ResponseEntity.ok("Hello My First Spring Boot Project. Well Done ID"+e.getMessage());
        }


        return ResponseEntity.ok("Hello My First Spring Boot Project. Well Done ID"+result);

    }

    public static <T> T json2Java(String fileName, Class<T> classType){

    	T t = null;
    	File file = new File("src/main/resources/"+fileName);
    	
    	 try {
    		 ObjectMapper mapper = new ObjectMapper();
    	    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			t=mapper.readValue(file, classType);
		}catch (Exception e) {
			e.printStackTrace();
		}
    	 
        return t;
    }
    
    @GetMapping("/subscribe")
    public ResponseEntity<String> getsubscribe()
    {
        return ResponseEntity.ok("Please subscribe.");
    }
    
}
