import java.util.HashMap;

public class Interesting_Party {
	
	public int bestInvitations(String[] first, String[] second) {
		int num = 0;
		HashMap <String, Integer> friend = new HashMap<>();
		
		for(int i = 0; i < first.length; i++) {
			if(friend.get(first[i]) == null) {
				friend.put(first[i], 1);
			}else {
				friend.put(first[i], friend.get(first[i])+1);
			}
		}
		for(int i = 0; i < second.length; i++) {
			if(friend.get(second[i]) == null) {
				friend.put(second[i], 1);
			}else {
				friend.put(second[i], friend.get(second[i])+1);
			}
		}
		
		for(int i : friend.values()) {
			num = Math.max(i, num);
		}
		
		return num;
	}
}
