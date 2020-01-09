import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Ex62 extends ConsoleProgram {
    public void run() {
        HashMap<String, ArrayList<String>> map = enterFriends();
       	
        for (String person : map.keySet() ) {
		ArrayList<String> friends = map.get(person);
		println(person);
		for (String friend : friends) 
			println("    " + friend);
	}	
    }

    HashMap<String, ArrayList<String>> enterFriends() {
	HashMap <String, ArrayList<String>> map = new HashMap<>();
	String a = readLine("enter friend A: ");
	while (!a.equals("")) {
		String b = readLine("enter friend B: ");
		ArrayList<String> friends = new ArrayList<>();
		if (map.contains(a)) {	
			friends = map.get(a);
		}
		friends.add(b);
		map.put(a, friends);

		String a = readLine("enter friend A: ");

    }
}
