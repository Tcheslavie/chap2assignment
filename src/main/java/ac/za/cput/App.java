package ac.za.cput;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello there!" );

        System.out.println( "Let's first implement a List" );
        List myList = new ArrayList();
        myList.add("List Entry 1");
        myList.add("List Entry 2");
        myList.add("List entry 3");
        String entry = "Entry Object";
        myList.add(0, entry);
        for(int i=0; i<myList.size(); i++) System.out.println(myList.get(i));

        System.out.println( "\nNow we can take a look at the Set" );
        Set mySet = new HashSet();
        mySet.add("Set Entry 1");
        mySet.add(entry);
        mySet.add("Set Entry 2");
        mySet.add("Set Entry 2");
        for(int i=0; i<mySet.size(); i++) System.out.println(mySet.toArray()[i]);
        System.out.println( "In set duplicates are removed and it is unordered.\n" );

        System.out.println( "Finally we will try to use the Map" );
        Map myMap = new HashMap();
        myMap.put("E1", "Entry 1");
        myMap.put("E2", entry);

        String getE2 = (String) myMap.get("E2");
        System.out.println( "The object with the Key \"E2\" is "+getE2 );

        System.out.println( "\nand generic collection of objects \"myObject\":" );
        Collection<myObject> myCol = new ArrayList<myObject>();
        myCol.add(new myObject("One"));
        myCol.add(new myObject("Two"));
        for(int i=0; i<myCol.size(); i++) System.out.println(((ArrayList<myObject>) myCol).get(i).getName());




    }

}
