package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataTextFileMapping {
	
	ArrayList<DataTextMapping> dataTextFileMappings = null;
	
	public DataTextFileMapping(DataTextMapping...dataTextMappings){
		dataTextFileMappings = new ArrayList<DataTextMapping>(Arrays.asList(dataTextMappings));
	}
	
}
