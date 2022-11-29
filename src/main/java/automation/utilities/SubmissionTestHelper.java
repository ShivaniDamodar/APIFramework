package automation.utilities;

import java.util.Map;
 

public class SubmissionTestHelper {
	
	public static String generateTestSubmission(String TestFileName, Map<String, String> replacements) {
		 
		
		String userJson = GetJsonHelper.getTestJSON(TestFileName);
		for (Map.Entry<String, String> replacement : replacements.entrySet()) {
			String replacementKey = replacement.getKey();
			String replacementValue = replacement.getValue();
			userJson = userJson.replace(replacementKey, replacementValue);
			
		}

		return userJson;

		
		
	}

}
