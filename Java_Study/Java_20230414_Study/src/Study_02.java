public class Study_02 {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = ~v1; //비트 반전 연산자(비트값: 0 -> 1, 1 -> 0으로 변환)
        int v3 = ~v1 + 1;
        System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
        System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
        System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");

        int v4 = -10;
        int v5 = ~v4;
        int v6 = ~v4 + 1;
        System.out.println(toBinaryString(v3) + " (십진수: " + v4 + ")");
        System.out.println(toBinaryString(v3) + " (십진수: " + v5 + ")");
        System.out.println(toBinaryString(v3) + " (십진수: " + v6 + ")");

    }

    public static String toBinaryString(int value){
        String str = Integer.toBinaryString(value);
        while(str.length() < 32){ // 생략된 0을 보이도록 출력해 줌
            str = "0" + str;
        }
        return str;
    }
}
