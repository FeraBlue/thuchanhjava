import java.util.ArrayList;
import java.util.Iterator;

public class App3 {
    public static void main(String[] args) {
        ArrayList<Float> floating = new ArrayList<>();
        floating.add(0.7f);
        floating.add(7.26f);
        floating.add(1.02f);
        floating.add(9.3f);
        Iterator<Float> iterator = floating.iterator();
        System.out.println("cac phan tu trong floating la: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
