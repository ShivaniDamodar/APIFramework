package automation.utilities;

import java.util.HashMap;
import java.util.Map;

public class Payload {
	
	public static String getAddUserPayLoad(String filePath, String name,String job) {
		final Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("$$name$$", name);
		parameters.put("$$job$$", job);
		 
		return SubmissionTestHelper.generateTestSubmission(filePath, parameters);
	}



}
