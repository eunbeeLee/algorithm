package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class AnImcompletePlayer {
    public String solution(String[] participantArr, String[] completionArr) {
        String result = "";
        Map<String, String> map = new HashMap<>();
        List<String> participantList = Arrays.asList(participantArr);

        for (int i = 0 ; i< participantArr.length; i++){
            for(String completion: completionArr){
                if (participantArr[i].equals(completion)){

                    break;
                }
            }
        }
        return result;
    }
}