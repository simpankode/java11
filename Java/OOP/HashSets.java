package OOP;

import java.util.HashSet;

public class HashSets {
    
    public static void main(String[] args) {
        
        HashSet<String> Person = new HashSet<String>();
        
        //add items
        Person.add("name");
        Person.add("username");
        Person.add("age");
        Person.add("city");
        System.out.println(Person);

        //cek items
        System.out.println(Person.contains("name"));

        //remove items
        Person.remove("city");
        System.out.println(Person);

        //remove all items
        Person.clear();
        System.out.println(Person);

        //size of hashset
        System.out.println(Person.size());

        //for each loop
        for (String key : Person) {
            System.out.println(key);
        }
    }
}
