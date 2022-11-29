package automation.utilities;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

public class GetJsonHelper {
	
	public static String getTestJSON(String fileName)
	{
	ClassLoader classLoader = SubmissionTestHelper.class.getClassLoader();

	String clipSubmitJSON = null;

	try {
		clipSubmitJSON = IOUtils.toString(classLoader.getResourceAsStream(fileName),"UTF-8");
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	System.out.println(clipSubmitJSON);
	return clipSubmitJSON;
	
	}

}
