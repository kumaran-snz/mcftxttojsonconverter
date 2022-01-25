package nz.co.acc.mcftxttojsonconverter;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import nz.co.acc.mcftxttojsonconverter.model.FileMetaData;
import nz.co.acc.mcftxttojsonconverter.util.AEPUtil;

/**
 * Hello world!
 *
 */
public class App {
	static Properties prop;

	public static void main(String[] args) throws Exception {
		InputTxtFileProcessor inputTextFileProcessor = new InputTxtFileProcessor();
		for (File file : getInputFilesDirectory().listFiles()) {
			if (file.getName().endsWith(AEPUtil.FILE_EXTENTION_TXT)) {
				System.out.println("Found test file : " + file.getName());
				FileMetaData fileMetaData = inputTextFileProcessor.processInputTestFile(file);
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String jsonString = gson.toJson(fileMetaData);

				System.out.println();
				
				String outputFileName = file.getName().substring(0, file.getName().indexOf(".")).concat(AEPUtil.FILE_EXTENTION_JSON);
				
				FileWriter fileWriter = new FileWriter(prop.getProperty(AEPUtil.OUTPUT_FOLDER_PROP) + "\\" + outputFileName);
				fileWriter.write(jsonString);
				fileWriter.close();
			}
		}
	}

	private static File getInputFilesDirectory() throws Exception {
		initialisePropertyFile();
		String inputFolder = prop.getProperty(AEPUtil.INPUT_FOLDER_PROP);
		System.out.println("Input folder : " + inputFolder);
		File inputFileFolder = new File(inputFolder);
		return inputFileFolder;
	}

	private static void initialisePropertyFile() throws Exception {
		InputStream inputStream = App.class.getResourceAsStream(AEPUtil.PROPERTY_FILE);
		if (prop == null) {
			prop = new Properties();
			prop.load(inputStream);
		}

	}
}
