public class Study_01 {
    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 3;
        int var3 = 2;
        int result = var1 + var2 * var3; //곱하기 덧셈 순으로 연산된다.
        int result2 = (var1 + var2) * var3; //덧셈을 먼저 하려면 괄호() 를 이용한다.
        System.out.println(result);
        System.out.println(result2);

    }
}
