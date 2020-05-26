package programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class AnImcompletePlayer {
    public String solution(String[] participantList, String[] completionList) {
        Map<String, String> playerMap = new HashMap<>();

        for (String participant : participantList) {
            playerMap.put(participant, "");
        }

        for (String completion : completionList){
            if (playerMap.containsKey(completion)){
                playerMap.remove(completion);
            }
        }


        return playerMap.keySet().iterator().next();
    }
}