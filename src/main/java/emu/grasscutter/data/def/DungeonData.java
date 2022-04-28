package emu.grasscutter.data.def;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;

import emu.grasscutter.game.props.SceneType;

@ResourceType(name = "DungeonExcelConfigData.json")
public class DungeonData extends GameResource {
	private int Id;
	private int SceneId;
	private String InvolveType; // TODO enum
	    
	@Override
	public int getId() {
		return this.Id;
	}

	public int getSceneId() {
		return SceneId;
	}
	
	@Override
	public void onLoad() {
		
	}
}
