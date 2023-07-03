package Test_Classes;

import Common_API_Methods.Get_API_Method;
import RequestRepository.Get_Req_Repository;

public class Get_TC1 {

	public static void extractor() {

		int Statuscode=Get_API_Method.ResponseStatusCode(Get_Req_Repository.baseURI(), Get_Req_Repository.Get_Resource());
		System.out.println(Statuscode);
		
		
		String ResponseBody=Get_API_Method.ResponseBody(Get_Req_Repository.baseURI(), Get_Req_Repository.Get_Resource());
		System.out.println(ResponseBody);
	}
}


