package javaclass;
import java.util.*;

public class hiii {
	

	public class RecentlyPlayedSongsStore {
	    private final int capacity; // maximum number of songs to store per user
	    private Map<String, LinkedList<String>> store; // song-user pairs stored in a map

	    public RecentlyPlayedSongsStore(int capacity) {
	        this.capacity = capacity;
	        this.store = new HashMap<>();
	    }

	    // Adds a song to the user's recently played list
	    public void addSong(String user, String song) {
	        LinkedList<String> songs = store.getOrDefault(user, new LinkedList<>());

	        if (songs.size() == capacity) {
	            songs.removeFirst(); // removes the least recently played song if the capacity is exceeded
	        }

	        songs.addLast(song);
	        store.put(user, songs);
	    }

	    // Fetches the user's recently played songs
	    public List<String> getRecentlyPlayedSongs(String user) {
	        LinkedList<String> songs = store.getOrDefault(user, new LinkedList<>());
	        return new ArrayList<>(songs); // returns a copy of the list to prevent modifications to the original
	    }
	}


}
