package core;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class FlatMapping {
	
	private String mappingName = null;
	private HBox control = new HBox();
	private Text mappedName = new Text();
	private Text mappedLength = new Text();
	private Text mappedStart = new Text();
	
	public FlatMapping(String mappingName){
		this.mappingName = mappingName;
		this.mappedLength.setDisable(true);
		this.control.getChildren().addAll(this.mappedName,this.mappedStart);
	}
	
	private Integer getMappingLength(){
		return this.mappingName.length();
	}
	
	private Integer getFinishingPosition(){
		return this.getMappingLength();
	}
	
	private Integer getFinishingPosition(Integer startingPosition){
		return this.getMappingLength() + startingPosition;
	}
	
	protected HBox getMappingUIControl(){
		return this.control;
	}
}
