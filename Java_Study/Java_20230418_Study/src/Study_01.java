public class Study_01 {
    public static void main(String[] args) {
        int x = 5;
        double y= 0.0;

        double z = x / y; // Infinity 값 출력
        //double z = x % y; // NaN 값 출력

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));

        System.out.println(z+2); //문제가 되는 코드
    }
}
