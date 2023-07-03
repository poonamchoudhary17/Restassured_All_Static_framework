package RequestRepository;

public class Put_Req_Repository {
	
public static String baseURI()
{
	String BaseURI = "https://reqres.in/" ;
	return BaseURI;
}
public static String Put_Resource() 
{
	String Put_Resource= "api/users/2";
	return Put_Resource;
}
public static String Put_Req_TC1() 
{
	String RequestBody= "{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"zion resident\"\r\n"
			+ "}";
   
	return RequestBody;
}
}

