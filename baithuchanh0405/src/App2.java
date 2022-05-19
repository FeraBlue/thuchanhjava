import java.util.ArrayList;
import java.util.ListIterator;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Character> array = new ArrayList<>();
        array.add('a');
        array.add('e');
        array.add('b');
        array.add('c');
        ListIterator<Character> listIterator = array.listIterator();
        System.out.println("cac phan tu co trong array la: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + "\t");
        }
    }
}
