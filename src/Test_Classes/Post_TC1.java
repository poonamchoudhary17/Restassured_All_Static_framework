package Test_Classes;

import java.io.IOException;

import org.testng.Assert;


import Common_API_Methods.API_Methods;
import Common_API_Methods.Common_Utility_Method_Post;
import RequestRepository.Post_Req_Repository;
import io.restassured.path.json.JsonPath;

public class  Post_TC1{
	
public static void extractor() throws IOException 
{
	for(int i=0; i<7; i++) {
		
	
	int statusCode = API_Methods.ResponsestatusCode(
	Post_Req_Repository.baseURI(),
	Post_Req_Repository.Post_Resource(),
	Post_Req_Repository.Post_Req_TC1());
	
	if (statusCode==201)
	{
	System.out.println(statusCode);
	
	String ResponseBody =API_Methods.ResponseBody (
	Post_Req_Repository.baseURI(),
	Post_Req_Repository.Post_Resource(),
	Post_Req_Repository.Post_Req_TC1());
	System.out.println(ResponseBody);
	
	String RequestBody= Post_Req_Repository.Post_Req_TC1();
	
	Common_Utility_Method_Post.EvidenceCreator("TC1",RequestBody,ResponseBody,statusCode);
	
	//validator(ResponseBody,RequestBody);
	
	
	break;
	}
	else {
		//System.out.println("INVALID STATUS ");
	}
}}
   public static void validator(String ResponseBody,String RequestBody) {
	JsonPath Jpost =new JsonPath(ResponseBody);
	String post_res_name=Jpost.getString("name");
	String post_res_job=Jpost.getString("job");
	
	Assert.assertEquals(post_res_name, "morpheus");
	Assert.assertEquals(post_res_job, "leader");
}
}