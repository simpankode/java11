package OOP;

import java.util.HashMap;

public class HashMaps {
    
    public static void main(String[] args) {
        
        HashMap<String, String> Person = new HashMap<String, String>();

        Person.put("name", "Prayoga Eka Ardiansyah");
        Person.put("username", "prayogaea");
        Person.put("age", "21");
        Person.put("city", "Malang");

        //access items
        Person.get("name");
        Person.get("username");
        Person.get("age");
        Person.get("city");
        System.out.println(Person);

        //remove items
        Person.remove("username");
        System.out.println(Person.get("username"));

        //remove all items
        Person.clear();
        System.out.println(Person);

        //size of hashmap
        System.out.println(Person.size());

        //key set
        System.out.println(Person.keySet());

        //value set
        System.out.println(Person.values());

        //for each loop
        for (String key : Person.keySet()) {
            System.out.println(key + " : " + Person.get(key));
        }
    }
}
