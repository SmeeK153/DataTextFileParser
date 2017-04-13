package core;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class DataTextMapping {
	
	private Integer startPosition = null;
	private String mappingName = null;
	private HBox control = new HBox();
	private Text mappedName = new Text();
	private Text mappedLength = new Text();
	private Text mappedStart = new Text();
	
	public DataTextMapping(String mappingName){
		this(mappingName,0);
	}
	
	public DataTextMapping(String mappingName, DataTextMapping predecessor){
		this(mappingName,predecessor.getFinalPosition() + 1);
	}
	
	public DataTextMapping(String mappingName, Integer startPosition){
		this.startPosition = startPosition;
		this.mappingName = mappingName;
		this.mappedLength.setDisable(true);
	}
	
	private Integer getMappingLength(){
		return this.mappingName.length();
	}
	
	private Integer getFinalPosition(){
		return this.startPosition + this.getMappingLength();
	}
	
	protected HBox getMappingUIControl(){
		
		
		
		
		return this.control;
	}
}
