package programmers;

import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/64061?language=java
 */
public class Kakao19CraneGame {
    public static int solution(int[][] board, int[] moves) {
        int removedDoll = 0;
        Stack<Integer> dollStorage = new Stack();

        for (int move : moves) {
            for (int i = 0 ; i < board.length; i++){
                int doll = board[i][move-1];

                if (doll > 0){
                    if (dollStorage.size() > 0){
                        if (dollStorage.peek() == doll){
                            dollStorage.pop();
                            removedDoll += 2;
                        }else{
                            dollStorage.add(doll);
                        }
                    }else{
                        dollStorage.add(doll);
                    }
                    board[i][move-1] = 0;
                    break;
                }
            }
        }
        return removedDoll;
    }
}
