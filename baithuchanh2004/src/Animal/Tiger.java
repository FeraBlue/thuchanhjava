package Animal;

public class Tiger extends Animal {
     void Eat(){
        System.out.println("Ho an thit");
    }
     void Walk(){
        System.out.println("Ho di trong rung");
    }
     void Sleep(){
        System.out.println("Ho di ngu");
    }
     void Roar(){
        System.out.println("Ho gam gu");
    }
     void Run(){
        System.out.println("Ho chay bat moi");
    }
    public static void main(String args[]) {
        Animal tony = new Tiger();
        tony.Eat();
        tony.Walk();
        tony.Sleep();
        tony.Roar();
        tony.Run();
    }
}
