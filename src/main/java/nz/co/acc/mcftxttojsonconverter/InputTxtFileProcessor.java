package nz.co.acc.mcftxttojsonconverter;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import com.google.common.base.Splitter;

import nz.co.acc.mcftxttojsonconverter.model.FileMetaData;

public class InputTxtFileProcessor {
	
	public void processInputTestFile(File file) throws Exception {
		Scanner fileScanner = new Scanner(file);
		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			List<String> arrayOfFields = Splitter.on("\t").splitToList(line);
			// Get the recordTag
			String recordType = arrayOfFields.get(0);
			
			switch(recordType) {
			 
			}
		}
	}

}
