package Car;

 class Taxicar implements Car {
    public void Move(){
        System.out.println("Xe Taxi Chay");
    }
    public void Stop(){
        System.out.println("Xe Taxi Dung");
    }
    public void TurnRight(){
        System.out.println("Xe Taxi Re Phai");
    }
    public void TurnLeft(){
        System.out.println("Xe Taxi Re Trai");
    }
    public void Reverse(){
        System.out.println("Xe Taxi Di Nguoc Lai");
    }
    
    public static void main(String args[]) {
    Car taxi = new Taxicar();
    taxi.Move();
    taxi.Stop();
    taxi.TurnRight();
    taxi.TurnLeft();
    taxi.Reverse();
    }
}
