package programmers;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class AnImcompletePlayer {
    public String solution(String[] participantArr, String[] completionArr) {
        String result = "";
        Map<String, String> map = new HashMap<>();
        List<String> participantList = new ArrayList<>();
        participantList.addAll(Arrays.asList(participantArr));
        List<String> completionList = new ArrayList<>();
        completionList.addAll(Arrays.asList(completionArr));

        for (String participant : participantArr){
            for(String completion: completionList){
                if (participant.equals(completion)){
                    participantList.remove(participantList.indexOf(participant));
                    completionList.remove(participantList.indexOf(participant));
                    break;
                }
            }
        }
        return participantList.get(0);
    }
}