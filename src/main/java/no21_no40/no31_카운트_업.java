package no21_no40;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class no31_카운트_업 {
        public int[] solution(int start_num, int end_num) {
            int[] answer = new int[end-start+1];

            for(int i = 0; i< answer.length; i++){
                answer[i] = start_num;
                start_num++;
            }
            return answer;
        }
}

/*
public List solution (int start_num, int end_num){
    List<Integer>answer = new ArrayList<>();
    for (int i=start_num; i<=end_num; i++){
        answer.add(i);
    }
    return answer;
}*/
