package RequestRepository;

public class Patch_Req_Repository {
	
public static String baseURI()
{
	String BaseURI = "https://reqres.in/" ;
	return BaseURI;
}
public static String Patch_Resource() 
{
	String Patch_Resource= "api/users/2";
	return Patch_Resource;
}
public static String Patch_Req_TC1() 
{
	String RequestBody= "{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}";
   
	return RequestBody;
}
}

