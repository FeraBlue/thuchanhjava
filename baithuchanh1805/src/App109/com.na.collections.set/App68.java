import java.util.TreeSet;

public class App68{
    public static void main(String[] args){
        TreeSet<Integer> treeSetInteger=new TreeSet<>();

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Cac phan tu trong treesetInteger: ");
        System.out.println(treeSetInteger);
        int arr[]={7,1,6,9,3,10};
        System.out.println("Nhung phan tu can them vao " );
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
          if (!treeSetInteger.contains (arr[i])){
            treeSetInteger.add(arr[i]);
            System.out.println("Phan tu " + arr[i] + " them thanh cong!");
          }else{
            System.out.println("Phan tu "+ arr[i] +" da ton tai!");
            }
        }
        System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
        System.out.println(treeSetInteger);
    }
}