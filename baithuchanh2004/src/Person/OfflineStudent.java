package Person;

public class OfflineStudent extends Student{

    public int Number;
    public void addnumber(){
        System.out.print("Si So:");
        Number = sc.nextInt();
    }
    public void PrintNumber(){
        System.out.print( "Si So = "+Number);
    }

}