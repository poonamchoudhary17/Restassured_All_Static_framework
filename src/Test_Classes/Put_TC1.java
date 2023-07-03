package Test_Classes;

import org.testng.Assert;


import Common_API_Methods.API_Methods;
import Common_API_Methods.Put_API_Methods;
import RequestRepository.Put_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Put_TC1 {
	
public static void extractor() 
{
	int statusCode = Put_API_Methods.ResponsestatusCode(
	Put_Req_Repository.baseURI(),
	Put_Req_Repository.Put_Resource(),
	Put_Req_Repository.Put_Req_TC1());
	System.out.println(statusCode);
	
	String ResponseBody =Put_API_Methods.ResponseBody (
	Put_Req_Repository.baseURI(),
	Put_Req_Repository.Put_Resource(),
	Put_Req_Repository.Put_Req_TC1());
	System.out.println(ResponseBody);
	
	JsonPath JspResponse =new JsonPath(ResponseBody);
	String put_res_name=JspResponse.getString("name");
	String put_res_job=JspResponse.getString("job");
	
	
	Assert.assertEquals(put_res_name, "morpheus");
	Assert.assertEquals(put_res_job, "zion resident");
}
}