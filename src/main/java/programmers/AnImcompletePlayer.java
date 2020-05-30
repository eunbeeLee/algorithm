package programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
class AnImcompletePlayer {
    public String solution(String[] participantArr, String[] completionArr) {
        List<String> participantList = new ArrayList<>();
        participantList.addAll(Arrays.asList(participantArr));

        for (String completion: completionArr){
            if (participantList.contains(completion)){
                participantList.remove(participantList.indexOf(completion));
            }
        }

        return participantList.get(0);
    }
}