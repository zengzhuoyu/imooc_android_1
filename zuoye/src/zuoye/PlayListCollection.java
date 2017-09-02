package zuoye;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PlayListCollection {

	//为什么选Map类型
	private Map<String,PlayList> playListMap;//<String,PlayList>
	
	public PlayListCollection(Map<String,PlayList> playListMap) {//<String,PlayList>
		this.playListMap = playListMap;
	}

	public Map<String,PlayList> getPlayListMap() {
		return playListMap;
	}

	public void setPlayListMap(Map<String,PlayList> playListMap) {
		this.playListMap = playListMap;
	}
	
	//添加播放列表
	public void addPlayList(PlayList playList) {
		playListMap.put(playList.getPlayListName(),playList);
	}
	
	//删除播放列表
	public void deletePlayList(PlayList playList) {
		playListMap.remove(playList.getPlayListName());
	}
	
	//通过名字查询
	public PlayList searchPlayListByName(String playListName) {

		if(!playListMap.isEmpty()) {
			Set<String> keySet = playListMap.keySet();
			for(String key:keySet) {
				if(playListName.equals(key)) {
					return playListMap.get(key);
				}
			}
		}
		
		return null;
	}
	
	//显示所有播放列表名称
	public void displayPlayListName() {
		Set<Entry<String,PlayList>> entrySet = playListMap.entrySet();
		for(Entry<String,PlayList> entry:entrySet) {
			System.out.println(entry.getKey());
		}
	}
	
	
}
