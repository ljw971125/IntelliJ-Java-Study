public class Study_01 {
    public static void main(String[] args) {
        //실수값 저장
        double var1 = 3.14;
        //float var2 = 3.14;
        float var3 = 3.14F; //실수를 float형에 저장하려면 뒤에 F나 f를 붙여야 함

        //정밀도 테스트
        double var4 = 0.1234567890123456789;
        float var5 = 0.1234567890123456789F;

        System.out.println("var1: " + var1);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

        //e 사용하기
        int var6 = 3000000;
        double var7 = 3e6; //3x10의 6승
        float var8 = 3e6F; //3x10의 6승
        double var9 = 2e-3; //2x10의 -3승
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
        System.out.println("var9: " + var9);

    }
}
