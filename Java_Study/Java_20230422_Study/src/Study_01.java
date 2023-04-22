public class Study_01 {
    public static void main(String[] args) {
        // 두개의 글자가 일치한지 비교해줌
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        String strVar3 = new String("신민철");

        System.out.println(strVar1 == strVar2);
        System.out.println(strVar1 == strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));
    }
}
