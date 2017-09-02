package zuoye;

import java.util.List;

public class PlayList{

	private String playListName;//������Сд��ͷ���շ巨
	
	private List<Song> musicList;//<Song>

	public PlayList(String playListName, List<Song> musicList) {
		
		this.playListName = playListName;
		this.musicList = musicList;
	}

	public String getPlayListName() {
		return playListName;
	}

	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}

	public List<Song> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Song> musicList) {
		this.musicList = musicList;
	}
	
	//���������ӵ������б�
	public boolean addToPlayList(Song song) {
		
		boolean flag = false;
		
		for(Song music:musicList) {//Song
			
			if(music.equals(song)) {
				flag = true;
				break;
			};
		}
		
		if(flag == true) {
			return false;
		}else {
			return musicList.add(song);
		}

	}
	
	//��ʾ�����б������и���
	public void displayAllSong() {
		for(int i = 0;i < musicList.size();i++) {
			System.out.println(musicList.get(i));
		}
	}
	
	//ͨ��id��ѯ����
	public Song searchSongById(String id) {

		for(int i = 0;i < musicList.size();i++) {
			if(musicList.get(i).getId().equals(id)) {//�ж��ַ������һ������equals
				return musicList.get(i);
			}

		}
		
		return null;

	}
	
	//ͨ�����Ʋ�ѯ����
	public Song searchSongByName(String name) {

		for(int i = 0;i < musicList.size();i++) {
			
			if(musicList.get(i).getName().equals(name)) {
				return musicList.get(i);
			}

		}
		
		return null;

	}	
	
	//ͨ������ɾ������
	public void deletePlayListSong(Song song) {
		musicList.remove(song);
	}

	
}