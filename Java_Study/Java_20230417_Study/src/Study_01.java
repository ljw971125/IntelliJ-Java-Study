public class Study_01 {
    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;
        int z = x * y; // 값의 최대 범위를 초과하여 쓰레기 값인 -727379968을 얻게된다
        System.out.println(z);
    }
}
