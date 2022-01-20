package nz.co.acc.mcftxttojsonconverter;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import nz.co.acc.mcftxttojsonconverter.util.AEPUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	static Properties prop;
	
    public static void main( String[] args ) throws Exception
    {
    	InputTxtFileProcessor inputTextFileProcessor = new InputTxtFileProcessor();
        for (File file : getInputFilesDirectory().listFiles()) {
        	System.out.println("Found test file : " + file.getName());
        	inputTextFileProcessor.processInputTestFile(file);
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
