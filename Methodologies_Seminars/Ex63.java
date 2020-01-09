

import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

class Person {
	String name;
	String surname;
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	void setSurname(String s) {surname = s;}
	String getSurname() { return surname; }
}
public class Ex63 extends ConsoleProgram {
    public void run() {
        HashMap<String, ArrayList<String>> map = enterFriends();
       	
        for (String person : map.keySet() ) {
		ArrayList<String> friends = map.get(person);
		println(person);
		for (String friend : friends) 
			println("    " + friend);
	}	
        HashMap<String, Person> personMap = new HashMap<>();
        Person p1 = new Person("a", "b");
        personMap.put("first", p1);
        Person p2 = personMap.get("first");
        p2.setSurname("c");
        Person p3 = personMap.get("first");
        println(p3.getSurname());
        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("first", 3);
        Integer i2 = map3.get("first");
        i2 = 5;
        Integer i3 = map3.get("first");
        println(i3);
    }

    HashMap<String, ArrayList<String>> enterFriends() {
	HashMap <String, ArrayList<String>> map = new HashMap<>();
	String a = readLine("enter friend A: ");
	while (!a.equals("")) {
		String b = readLine("enter friend B: ");
		ArrayList<String> friends = new ArrayList<>();
		if (map.containsKey(a)) {	
			friends = map.get(a);
		}
		friends.add(b);
		if (!map.containsKey(a))
			map.put(a, friends);

		a = readLine("enter friend A: ");

    }
	return map;
    }
}
