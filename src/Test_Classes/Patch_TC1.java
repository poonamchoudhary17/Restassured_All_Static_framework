package Test_Classes;

import org.testng.Assert;


import Common_API_Methods.API_Methods;
import Common_API_Methods.Patch_API_Methods;
import RequestRepository.Patch_Req_Repository;
import io.restassured.path.json.JsonPath;

public class Patch_TC1 {
	
public static void extractor() 
{
	int statusCode = Patch_API_Methods.ResponsestatusCode(
	Patch_Req_Repository.baseURI(),
	Patch_Req_Repository.Patch_Resource(),
	Patch_Req_Repository.Patch_Req_TC1());
	System.out.println(statusCode);
	
	String ResponseBody =Patch_API_Methods.ResponseBody (
	Patch_Req_Repository.baseURI(),
	Patch_Req_Repository.Patch_Resource(),
	Patch_Req_Repository.Patch_Req_TC1());
	System.out.println(ResponseBody);
	
	JsonPath JspResponse =new JsonPath(ResponseBody);
	String patch_res_name=JspResponse.getString("name");
	String patch_res_job=JspResponse.getString("job");
	
	
	Assert.assertEquals(patch_res_name, "morpheus");
	Assert.assertEquals(patch_res_job, "zion resident");
}
}