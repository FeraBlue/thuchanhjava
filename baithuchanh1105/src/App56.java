import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        hashSetString.add("Jonathan");
        hashSetString.add("Joseph");
        hashSetString.add("Giorno");
        hashSetString.add("Jolyne");
        hashSetString.add("Johnny");
        hashSetString.add("Johnny");

        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        name = scan.nextLine();

        if(hashSetString.contains(name)) {
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai hashSetString: ");
            System.out.println(hashSetString);
        }else {
            System.out.println("Xoa khong thanh cong");
            scan.close();
        }
    }
}