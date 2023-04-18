public class Study_03 {
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf(userInput);

        double currentBalance = 10000.0;

        if(Double.isNaN(val)){ // 수가 NaN인지 검사
            System.out.println("NaN이 입력되어 처리할 수 없음"); // NaN일 경우 출력
            val = 0.0; // NaN일 경우 값을 0.0으로 변경
        }

        currentBalance += val; //if문에서 0.0으로 바뀌었기 때문에 원래값 유지
        System.out.println(currentBalance);
    }
}
