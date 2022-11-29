package automation.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;

public class MyTest {

	public static void main(String[] args) throws IOException {
		 
		  
		 String file = "Test.json";
		 ClassLoader classloader = MyTest.class.getClassLoader();
		 
		  String clipjson= IOUtils.toString(classloader.getResourceAsStream(file), "UTF-8");
		 System.out.println(clipjson);
		 Map<String, String> parameterforjson = new HashMap<String, String>();
		 parameterforjson.put("$$name$$", "shivani");
		 parameterforjson.put("$$job$$", "SDET"); 
		 for( Entry<String, String> parameterset : parameterforjson.entrySet())
		 {
			 String replacementkey = parameterset.getKey();
			 String replacementvalue = parameterset.getValue();
			 
			 clipjson =clipjson.replace(replacementkey, replacementvalue);
			 
			 
		 }
		 System.out.println(clipjson);
		 
	}

}
