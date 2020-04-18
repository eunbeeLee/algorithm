package programmers;

public class test1_20200418 {
    public static int solution(String present, String solve) {
        int count = 0;

        //0 9   0 1

        for(int i = 0; i < present.length(); i++){
            int presentNumber = Character.getNumericValue(present.charAt(i));
            int solveNumber = Character.getNumericValue(solve.charAt(i));

            int direction = -1;
            if (solveNumber - presentNumber > 0 && solveNumber - presentNumber <= 5){
                direction = 1;
            }


            while(presentNumber != solveNumber){
                if (presentNumber > 9 && direction == 1){
                    presentNumber = 0;
                    continue;
                }
                if (presentNumber < 0 && direction == -1){
                    presentNumber = 9;
                    continue;
                }

                presentNumber += direction;
                count++;
            }
        }

        return count;
    }
}
