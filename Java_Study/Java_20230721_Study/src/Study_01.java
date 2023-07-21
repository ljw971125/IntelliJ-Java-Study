public class Study_01 {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3]; //2차원 배열 mathScores 생성
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) { //배열을 반복문을 이용해 모두 호출
                System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]); //출력
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][]; //2차원 배열 englishScores 생성
        englishScores[0] = new int[2]; //배열의 값 개수 지정
        englishScores[1] = new int[3];
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) { //배열을 반복문을 이용해 모두 호출
                System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]); //출력
            }
        }
        System.out.println();

        int[][] javaScores = { {95, 80}, {92, 96, 80}}; //2차원 배열 javaScores 생성
        for (int i = 0; i < javaScores.length; i++) {
            for (int k = 0; k < javaScores[i].length; k++) { //배열을 반복문을 이용해 모두 호출
                System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]); //출력

            }

        }

    }
}
