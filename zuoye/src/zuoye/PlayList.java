package zuoye;

import java.util.List;

public class PlayList{

	private String playListName;//属性名小写开头，驼峰法
	
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
	
	//将歌曲添加到播放列表
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
	
	//显示播放列表中所有歌曲
	public void displayAllSong() {
		for(int i = 0;i < musicList.size();i++) {
			System.out.println(musicList.get(i));
		}
	}
	
	//通过id查询歌曲
	public Song searchSongById(String id) {

		for(int i = 0;i < musicList.size();i++) {
			if(musicList.get(i).getId().equals(id)) {//判断字符串相等一定得用equals
				return musicList.get(i);
			}

		}
		
		return null;

	}
	
	//通过名称查询歌曲
	public Song searchSongByName(String name) {

		for(int i = 0;i < musicList.size();i++) {
			
			if(musicList.get(i).getName().equals(name)) {
				return musicList.get(i);
			}

		}
		
		return null;

	}	
	
	//通过名称删除歌曲
	public void deletePlayListSong(Song song) {
		musicList.remove(song);
	}

	
}
