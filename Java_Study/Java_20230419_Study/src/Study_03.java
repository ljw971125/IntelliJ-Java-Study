public class Study_03 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); // true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v5);
        System.out.println(v4 == v5); // false (float 타입은 소수 5자리까지 정확하게 표현할 수 있으나 그 이상은 정확하게 표현 못함)
        System.out.println((float)v4 == v5); //true
        System.out.println((int)(v4*10) == (int)(v5*10)); // true
    }
}
