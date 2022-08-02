package autoapp.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class ConfigFileReader {

	private static final String PATH = System.getProperty("user.dir");

	public static String getPath() {
		return PATH;
	}

	static String propPath = PATH + "/src/test/resources/config.properties";

	public static String readProperty(String PropKey) {
		String PropValue = null;
		try {

			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			PropValue = prop.getProperty(PropKey);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return PropValue;

	}

}
