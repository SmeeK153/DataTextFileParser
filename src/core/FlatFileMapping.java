package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FlatFileMapping {
	
	private ArrayList<FlatMapping> flatFileMappings = null;
	
	public FlatFileMapping(FlatMapping...flatMappings){
		this.flatFileMappings = new ArrayList<FlatMapping>(Arrays.asList(flatMappings));
	}
	
}
