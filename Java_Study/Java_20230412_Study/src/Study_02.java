public class Study_02 {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1 =" + result1);
        System.out.println("result2 =" + result2);

        short s = 100; //short는 int와 같은 정수형이지만 표현할 수 있는 범위가 적음
        //short result3 = -s //컴파일 에러
        int result3 = -s;
        System.out.println("result3 =" + result3);


    }
}
