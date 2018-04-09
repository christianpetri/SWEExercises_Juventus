package ch.juventus.java.collections;

import java.util.*;

/**
 * @author : ${user}
 * @since: ${date}
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("ArrayList");
        ArrayList<String> tiere = new ArrayList<>();
        tiere.add("Hund");
        tiere.add("Katze");
        tiere.add("Maus");
        tiere.add("Hase");
        tiere.add("Elefant");
        tiere.add("Wolf");
        tiere.add("Giraffe");
        tiere.add("Fledermaus");
        tiere.add("Pudel");
        tiere.add("Gorilla");

        System.out.println(tiere.size());
        System.out.println("tiere.contains(\"Hund\"): "+tiere.contains("Hund"));
        //tiere.remove(11);
        System.out.println("tiere.remove(\"Gorilla\"): "+tiere.remove("Gorilla"));
        //tiere.clear();
        System.out.println(tiere.size());


        System.out.println();
        System.out.println("Linked List");
        /*
        * Die Länge der Liste ausgeben
         Den Index eines bestimmten Elements finden
         Den Index eines Elements das nicht existiert finden (was passiert?)
         Ein Element via Index lesen
         Das erste und letzte Element der Liste ausgeben
         Das erste und letzte Element der Liste löschen
        */
        LinkedList<String> tiereLiked = new LinkedList();
        tiereLiked.add("Hund");
        tiereLiked.add("Katze");
        tiereLiked.add("Maus");
        tiereLiked.add("Hase");
        tiereLiked.add("Elefant");
        tiereLiked.add("Wolf");
        tiereLiked.add("Giraffe");
        tiereLiked.add("Fledermaus");
        tiereLiked.add("Pudel");
        tiereLiked.add("Gorilla");

        System.out.println("tiereLiked.size()" + tiereLiked.size());
        System.out.println("tiereLiked.indexOf(\"Foo\") " + tiereLiked.indexOf("Foo"));
        System.out.println(tiereLiked.get(2));
        System.out.println(tiereLiked.getFirst());
        System.out.println(tiereLiked.getLast());
        System.out.println(tiereLiked.removeFirst());
        System.out.println(tiereLiked.removeLast());


        System.out.println();
        System.out.println("HashSet");
        /*
         Prüft ob das Set nicht leer ist
         Gebt die Länge des Sets aus. Existieren die Personen mit den gleichen Vor- und Nachnamen nur 1 mal?
            Wenn nicht, equals & hashCode überschreiben
         Prüft ob ein gewisses Element im Set existiert
         Löscht ein bestimmtes Element aus dem Set
        */

        Set hashSet = new HashSet();
        hashSet.add(new Person("Christian","Petri"));
        hashSet.add("Foo Foo");
        hashSet.add(new Person("Christian","Petri"));
        hashSet.add(new Person("Christian","Petri"));

        System.out.println(hashSet);

        System.out.println("is emtpy? " + hashSet.isEmpty());
        System.out.println("hashSet.size() " + hashSet.size());
        System.out.println("hashSet.contains(\"Christian Petri\") " + hashSet.contains("Christian Petri"));
        System.out.println("hashSet.remove(\"Foo Foo\") " + hashSet.remove("Foo Foo"));
        System.out.println(hashSet);

        System.out.println();
        System.out.println("Treeset");
        Set ts = new TreeSet();

        ts.add("Hund");
        ts.add("Katze");
        ts.add("Maus");
        ts.add("Hase");
        ts.add("Elefant");
        ts.add("Wolf");
        ts.add("Zebra");
        ts.add("Fledermaus");
        ts.add("Pudel");
        ts.add("Gorilla");
        ts.add("Fledermaus");
        ts.add("Pudel");
        ts.add("Gorilla");

        System.out.println(ts);


        System.out.println();
        System.out.println("Map<String , List<Person>> hashMap");
        Map<String , List<Person>> hashMap = new HashMap<>();

        List<Person>  family = new ArrayList<>();
        family.add(new Person("Christan", "Petri"));
        family.add(new Person("Walter", "Smith"));
        family.add(new Person("John", "Meier"));

        List<Person>  office = new ArrayList<>();

        List<Person>  friends = new ArrayList<>();
        friends.add(  new Person("Walter" , "Jung"));
        friends.add(  new Person("Hans" , "Peter"));
        friends.add(  new Person("Sven" , "Peterson"));


        hashMap.put("family", family );
        hashMap.put("office", null );
        hashMap.put("friends", friends );

        System.out.println(hashMap.values());
        System.out.println(hashMap.containsKey("family"));
        System.out.println(hashMap.entrySet());
        hashMap.put("office", office);
        System.out.println(hashMap.values());


        System.out.println();
        System.out.println("List Iterator");
        ListIterator<String> lItr = tiere.listIterator();
        // System.out.println(tiere);
        while (lItr.hasNext()){
            System.out.println(lItr.next());
        }

        Iterator<Map.Entry<String , List<Person>>> mapIterator = hashMap.entrySet().iterator();
        while (mapIterator.hasNext()){
            System.out.println(mapIterator.next());
        }
    }

}
