package zuoye;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PlayListCollection {

	//ΪʲôѡMap����
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
	
	//��Ӳ����б�
	public void addPlayList(PlayList playList) {
		playListMap.put(playList.getPlayListName(),playList);
	}
	
	//ɾ�������б�
	public void deletePlayList(PlayList playList) {
		playListMap.remove(playList.getPlayListName());
	}
	
	//ͨ�����ֲ�ѯ
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
	
	//��ʾ���в����б�����
	public void displayPlayListName() {
		Set<Entry<String,PlayList>> entrySet = playListMap.entrySet();
		for(Entry<String,PlayList> entry:entrySet) {
			System.out.println(entry.getKey());
		}
	}
	
	
}
