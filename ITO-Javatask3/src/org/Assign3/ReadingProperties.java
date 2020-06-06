package org.Assign3;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ReadingProperties {
		public static void main(String[] args) throws PropertiesFileNotFound {
			readingproperties();
		}
		
		public static void readingproperties() throws PropertiesFileNotFound {
			
			try {
			FileReader reader = new FileReader("properties");
			Properties properties = new Properties();
			properties.load(reader);

			JDBC jdbc = new JDBC();
			jdbc.storingDataExcelToDB(properties);
		} catch(Exception e) {
			throw new PropertiesFileNotFound();
		}
	}
}
