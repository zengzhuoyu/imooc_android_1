package zuoye;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
//		testSong();
//		testPlayList();
//		testPlayListCollection();
//		mainMenu();
//		playListMenu();
//		playerMenu();
		test();

	}
	
	//���Ը���
	public static void testSong() {
		
		Song s1 = new Song("a001","����","�ܽ���");
		System.out.println(s1);
	}
	
	//���Բ����б�
	public static void testPlayList() {
		
		Song s1 = new Song("a001","����","�ܽ���");
		Song s2 = new Song("a002","ʮ��","����Ѹ");
		Song s3 = new Song("a003","�����������ǰ��","��֪��");
		
		List<Song> musiclist = new ArrayList<Song>();
		musiclist.add(s1);
		musiclist.add(s2);
		musiclist.add(s3);
		
		PlayList pl1 = new PlayList("�ҵ��ղ�",musiclist);
		
		Song s4 = new Song("a004","�����ɽ·ʮ����","���ǲ�֪��");
		pl1.addToPlayList(s4);
		System.out.println("��ʾ�����б������и�����");
		pl1.displayAllSong();
		System.out.println("ͨ��id��ѯ������");
		System.out.println(pl1.searchSongById("a001"));
		
	}
	
	//���Բ�����
	public static void testPlayListCollection() {
		
		Song s1 = new Song("a001","����","�ܽ���");
		Song s2 = new Song("a002","ʮ��","����Ѹ");
		Song s3 = new Song("a003","�����������ǰ��","��֪��");
		
		//���ִ��
		List<Song> playList = new ArrayList<Song>();
		playList.add(s1);
		playList.add(s2);
		playList.add(s3);
		
		PlayList pl1 = new PlayList("�ҵ��ղ�",playList);
		
		//�б����
		Map<String,PlayList> playListMap = new HashMap<String,PlayList>();
		playListMap.put(pl1.getPlayListName(), pl1);
		
		PlayListCollection plc1 = new PlayListCollection(playListMap);
		
		PlayList pl2 = new PlayList("�ҵ��ղ�2",playList);
		plc1.addPlayList(pl2);
		
		plc1.deletePlayList(pl2);
		
		System.out.println("ͨ�����ֲ�ѯ��");
		System.out.println(plc1.searchPlayListByName("�ҵ��ղ�"));
		
		System.out.println("**************************");
		
		System.out.println("��ʾ���в����б����ƣ�");
		plc1.displayPlayListName();
		
	}
	
	//���˵�
	public static void mainMenu() {
		System.out.println("**************************");
		System.out.println("       **���˵�**");
		System.out.println("       1--�����б�����");		
		System.out.println("       2--����������");
		System.out.println("       0���������ּ�--�˳�");	
		System.out.println("**************************");
		System.out.println("�������Ӧ�����ֽ��в�����");		
	}
	
	//�����б������˵�
	public static void playListMenu() {
		System.out.println("**********************************");
		System.out.println("       **�����б�����**");
		System.out.println("       1--���������ӵ��������б�");		
		System.out.println("       2--���������ӵ���ͨ�����б�");
		System.out.println("       3--ͨ������id��ѯ�����б��еĸ���");	
		System.out.println("       4--ͨ���������Ʋ�ѯ�����б��еĸ���");	
		System.out.println("       5--�޸Ĳ����б��еĸ���");	
		System.out.println("       6--ɾ�������б��еĸ���");	
		System.out.println("       7--��ʾ�����б��е����и���");	
		System.out.println("       8--�����赥");	
		System.out.println("       9���������ּ�--������һ���˵�");	
		System.out.println("**********************************");
		System.out.println("�������Ӧ�����ֶԲ����б����й�����");
	}
	
	//�������˵�
	public static void playerMenu() {
		System.out.println("**********************************");
		System.out.println("       **����������**");
		System.out.println("       1--�򲥷������Ӳ����б�");		
		System.out.println("       2--�Ӳ�����ɾ�������б�");
		System.out.println("       3--ͨ�����ֲ�ѯ�����б���Ϣ");	
		System.out.println("       4--��ʾ���в����б�����");	
		System.out.println("       9���������ּ�--������һ���˵�");	
		System.out.println("**********************************");
		System.out.println("�������Ӧ�����ֶԲ��������й�����");
	}
	
	//������
	public static void test() {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		boolean flag = true;
		
		Map<String,PlayList> playListMap = new HashMap<String,PlayList>();
		PlayListCollection plcollection = new PlayListCollection(playListMap);
		
		List<Song> musiclist = new ArrayList<Song>();
		PlayList mainPlayList = new PlayList("�������б�",musiclist);//���ܸ�ֵΪnull
		plcollection.addPlayList(mainPlayList);
		
		while(flag) {
			
			mainMenu();
			
			input = sc.nextInt();
			
			switch(input) {
			
				case 1:
					playList(plcollection);
					break;
					
				case 2:
					playerList(plcollection);
					break;
					
				case 0:
				default:
					flag = false;
					break;
			}			
		}

	} 
	
	//�����б�����
	public static void playList(PlayListCollection plcollection) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		boolean flag = true;
		
		while(flag) {
			
			playListMenu();
			
			input = sc.nextInt();
			
			String id = null;
			String name = null;
			String singer = null;
			
			PlayList mainPlayList = plcollection.searchPlayListByName("�������б�");
			
			switch(input) {
			
				//���������ӵ��������б�
				case 1:
					System.out.println("���������ӵ��������б�");
					System.out.println("������Ҫ���ӵĸ���������");
					
					int mainMusicCount = sc.nextInt();
					
					for(int i = 0;i < mainMusicCount;i++) {
						System.out.println("�������" + (i+1) + "�׸�����");
						System.out.println("�����������id��");
						id = sc.next();
						System.out.println("��������������ƣ�");
						name = sc.next();
						System.out.println("�������ݳ��ߣ�");
						singer = sc.next();		
						
						Song song = new Song(id,name,singer);
						
						if(!mainPlayList.addToPlayList(song)) {
							System.out.println("�ø����Ѵ���,���������룡");
							i--;
							continue;
						};
					}
				
					break;
					
				//���������ӵ���ͨ�����б�	
				case 2:
					System.out.println("���������ӵ���ͨ�����б�");
					System.out.println("������Ҫ���ӵĲ����б����ƣ�");
					
					PlayList searchPlayList = plcollection.searchPlayListByName(sc.next());
					if(searchPlayList == null) {
						System.out.println("�ò����б������ڣ����Ƚ������б����ӵ��������У�");
						break;
					}
					
					System.out.println("������Ҫ���ӵĸ���������");
					
					int commonMusicCount = sc.nextInt();
					
					for(int i = 0;i < commonMusicCount;i++) {
						System.out.println("�������" + (i+1) + "�׸�����");
						System.out.println("�����������id��");
						id = sc.next();

						Song searchSong = mainPlayList.searchSongById(id);

						if(searchSong != null) {
							searchPlayList.addToPlayList(searchSong);
							continue;
						}

						System.out.println("�ø������������б��в����ڣ��������������������Ϣ��");
						
						System.out.println("��������������ƣ�");
						name = sc.next();
						System.out.println("�������ݳ��ߣ�");
						singer = sc.next();		
						
						Song song = new Song(id,name,singer);
						
						searchPlayList.addToPlayList(song);
						mainPlayList.addToPlayList(song);
					}
					
					System.out.println("�������б���");
					System.out.println("�����б��е����и���Ϊ��");
					mainPlayList.displayAllSong();
					
					System.out.println("��ͨ�����б���");
					System.out.println("�����б��е����и���Ϊ��");
					searchPlayList.displayAllSong();
					
					break;
					
				//ͨ������id��ѯ�����б��еĸ���	
				case 3:
					System.out.println("ͨ������id��ѯ�����б��еĸ���");
					System.out.println("������Ҫ��ѯ�Ĳ����б����ƣ�");
					
					PlayList searchPlayListById = plcollection.searchPlayListByName(sc.next());
					
					System.out.println("������Ҫ��ѯ�ĸ���id��");
					Song searchSongById = searchPlayListById.searchSongById(sc.next());
					if(searchSongById == null) {
						System.out.println("�ø����ڲ����б�" + searchPlayListById.getPlayListName() + "�в����ڣ�");
						break;
					}
					System.out.println("�ø�������ϢΪ��");
					System.out.println(searchSongById);
					
					break;
					
				//ͨ�������Ʋ�ѯ�����б��еĸ���	
				case 4:
					System.out.println("ͨ���������Ʋ�ѯ�����б��еĸ���");
					System.out.println("������Ҫ��ѯ�Ĳ����б����ƣ�");
					
					PlayList searchPlayListByName = plcollection.searchPlayListByName(sc.next());
					
					System.out.println("������Ҫ��ѯ�ĸ������ƣ�");
					Song searchSongByName = searchPlayListByName.searchSongByName(sc.next());
					if(searchSongByName == null) {
						System.out.println("�ø����ڲ����б�" + searchPlayListByName.getPlayListName() + "�в����ڣ�");
						break;
					}
					System.out.println("�ø�������ϢΪ��");
					System.out.println(searchSongByName);
					
					break;
					
				//�޸Ĳ����б��еĸ���	
				case 5:
					System.out.println("�޸Ĳ����б��еĸ���");
					System.out.println("������Ҫ�޸ĵĸ���id��");
					
					id = sc.next();
					
					System.out.println("�������޸ĺ�ĸ������ƣ�");
					
					name = sc.next();
					
					System.out.println("�������޸ĺ���ݳ��ߣ�");
					
					singer = sc.next();
					
					Iterator<PlayList> itPlayLists = plcollection.getPlayListMap().values().iterator();
					Song isFoundedSong = null;
					PlayList playListUpdate = null;
					while(itPlayLists.hasNext()) {
						playListUpdate = itPlayLists.next();
						isFoundedSong = playListUpdate.searchSongById(id);
						if(isFoundedSong != null) {
							playListUpdate.deletePlayListSong(isFoundedSong);
							playListUpdate.addToPlayList(new Song(id,name,singer));//new Song(id,name,singer)
						}
					}
					
					System.out.println("�޸ĳɹ���");

					break;
					
				//ɾ�������б��еĸ���	
				case 6:
					System.out.println("ɾ�������б��еĸ���");
					System.out.println("������Ҫɾ���ĸ���id��");
					
					id = sc.next();
					
					System.out.println("������Ҫɾ���ĸ������ڵĲ����б���");
					
					String inputPlayList = sc.next();

					if(inputPlayList.equals("�������б�")) {

						Iterator<PlayList> itPlayListsii = plcollection.getPlayListMap().values().iterator();
						Song isFoundedSongii = null;
						PlayList playListDelete = null;
						while(itPlayListsii.hasNext()) {
							playListDelete = itPlayListsii.next();
							isFoundedSongii = playListDelete.searchSongById(id);
							if(isFoundedSongii != null) {
								playListDelete.deletePlayListSong(isFoundedSongii);
							}
						}
						
					}else{
						
						PlayList getPlayList = plcollection.searchPlayListByName(inputPlayList);
						
						getPlayList.deletePlayListSong(getPlayList.searchSongById(id));
					}
					
					System.out.println("ɾ���ɹ���");
					
					break;
					
				//��ʾ�����б��е����и���	
				case 7:
						System.out.println("��ʾ�����б��е����и���");
						System.out.println("������Ҫ��ʾ�Ĳ����б����ƣ�");
						
						PlayList displayPlayListSongs = plcollection.searchPlayListByName(sc.next());
						System.out.println("�����б��е����и���Ϊ��");
						displayPlayListSongs.displayAllSong();
						
						break;
						
				//�����赥
				case 8:
					
					System.out.println("�����赥");
					System.out.println("������Ҫ�����赥�Ĳ����б����ƣ�");
					
					String inputExportPlayList = sc.next();
					PlayList exportPlayList = plcollection.searchPlayListByName(inputExportPlayList);

					try {
						FileOutputStream fos = new FileOutputStream(inputExportPlayList + ".txt");
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						
						for(int i = 0;i < exportPlayList.getMusicList().size();i++) {
							oos.writeObject(exportPlayList.getMusicList().get(i));//��׷��д��
						}
						
						oos.flush();
						fos.close();
						oos.close();
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					System.out.println("�赥�����ɹ���");
					
					break;
					
				case 9:
				default:
					
					flag = false;
					break;
			}
		}

	}
		
	//����������
	public static void playerList(PlayListCollection plcollection) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		boolean flag = true;
		
		while(flag) {
			
			playerMenu();
			
			input = sc.nextInt();
			
			switch(input) {
			
				//�򲥷������Ӳ����б�
				case 1:
					System.out.println("�򲥷������Ӳ����б�");
					System.out.println("����Ҫ���ӵĲ����б����ƣ�");
					
					//��Ϊ���������������
					List<Song> commonMusiclist = new ArrayList<Song>();
					PlayList playList = new PlayList(sc.next(),commonMusiclist);//���ܸ�ֵΪnull
					plcollection.addPlayList(playList);
					
					break;
				
				//�Ӳ�����ɾ�������б�
				case 2:
					
					System.out.println("�Ӳ�����ɾ�������б�");
					System.out.println("����Ҫɾ���Ĳ����б����ƣ�");
					
					PlayList inputdeletePlayList = plcollection.searchPlayListByName(sc.next());

					plcollection.deletePlayList(inputdeletePlayList);
					
					System.out.println("ɾ���ɹ���");
					
					break;
					
				//ͨ�����ֲ�ѯ�����б���Ϣ	
				case 3:
					System.out.println("ͨ�����ֲ�ѯ�����б���Ϣ");
					System.out.println("������Ҫ��ѯ�Ĳ����б����ƣ�");
					
					PlayList searchPlayList = plcollection.searchPlayListByName(sc.next());
					if(searchPlayList != null) {
						System.out.println("�ò����б����ڣ�");
						System.out.println("�ò����б�������Ϊ��" + searchPlayList.getPlayListName());
						System.out.println("�����б��е����и���Ϊ��");
						searchPlayList.displayAllSong();
					}
					
					break;
					
				//��ʾ���в����б�����					
				case 4:
					System.out.println("��ʾ���в����б�����");
					System.out.println("�����б�����Ϊ��");
					
					plcollection.displayPlayListName();
					
					break;
					
				case 9:
				default:
					
					flag = false;
					break;
			}
		}
	}
	
}