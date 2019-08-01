import java.util.HashSet;
import java.util.Iterator;

public class hashset_1 {
    public static void main(String arg[] ){
        HashSet <Integer> set =new HashSet();
        set.add(2);
        set.add(2);
        set.add(5);
        Iterator<Integer> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }

}

