public class Car {
    int speed;

    void run(){
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Car myCar = new Car(); //정적 메소드를 호출할 땐 객체를 먼저 생성해 줘야 한다.
        myCar.speed = 60;
        myCar.run();
    }
}
