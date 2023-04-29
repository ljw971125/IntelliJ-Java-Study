public class Study_01 {
    public static void main(String[] args) {
        int score = 90;
        //앞에서부터 조건문 , ? (조건문이 참일 경우 실행할 표현식 : 조건문이 거짓일 경우 실행할 표현식)
        char grade = (score >90) ? 'A' : ( (score > 80 ) ? 'B' : 'C'); // score가 90점 이상이면 A출력 score가 90 이하 80점 초과 이면 B 이외의 값은 C 출력
        System.out.println(score + "점은 "+ grade + "등급입니다.");
    }
}
