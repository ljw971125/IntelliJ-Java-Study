public class Study_02 {
    public static void main(String[] args) {
        String userInput = "NaN"; // 사용자로부터 입력받은 값
        double val = Double.valueOf(userInput); // 입력값을 double 타입으로 변환

        double currentBalance = 10000.0;

        currentBalance += val; // currentBalance에 NaN이 저장됨
        System.out.println(currentBalance); // NaN은 어떠한 수가 연산되면 결과는 NaN으로 나온다.
    }
}
