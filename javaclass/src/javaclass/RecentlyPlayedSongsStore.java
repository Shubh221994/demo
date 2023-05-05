package javaclass;
import java.util.*;

public class RecentlyPlayedSongsStore {
	
	    private final int capacity; 
	    private Map<String, LinkedList<String>> store; 

	    public RecentlyPlayedSongsStore(int capacity) {
	        this.capacity = capacity;
	        this.store = new HashMap<>();
	    }

	    
	    public void addSong(String user, String song) {
	        LinkedList<String> songs = store.getOrDefault(user, new LinkedList<>());

	        if (songs.size() == capacity) {
	            songs.removeFirst(); 
	        }

	        songs.addLast(song);
	        store.put(user, songs);
	    }

	    
	    public List<String> getRecentlyPlayedSongs(String user) {
	        LinkedList<String> songs = store.getOrDefault(user, new LinkedList<>());
	        return new ArrayList<>(songs); 
	    }
	

public static void main(String[] args) {
	


RecentlyPlayedSongsStore store = new RecentlyPlayedSongsStore(3);

store.addSong("John", "S1");
store.addSong("John", "S2");
store.addSong("John", "S3");

System.out.println(store.getRecentlyPlayedSongs("John")); 

store.addSong("John", "S4");

System.out.println(store.getRecentlyPlayedSongs("John")); 

store.addSong("John", "S2");

System.out.println(store.getRecentlyPlayedSongs("John")); 

store.addSong("John", "S1");

System.out.println(store.getRecentlyPlayedSongs("John")); 

}}