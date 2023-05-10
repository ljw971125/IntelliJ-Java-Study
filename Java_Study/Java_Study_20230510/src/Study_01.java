public class Study_01 {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20) + 81;
        System.out.println("점수: "+ score);

        String grade;

        if(score>=90){
            if(score>=95){
                grade = "A+"; //95보다 크면
            }else{  //중첩 if문
                grade = "A";  //90보다 크면
            }
            }else{
            if(score>=85){
                grade = "B+"; //85보다 크면
            }else {
                grade = "B"; //80보다 크면
            }
        }
        System.out.println("학점: " + grade);
    }
}
