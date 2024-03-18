package no1_no20;

public class n20_flag에_따라_다른값_변환하기 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag==true){
            answer = (a)+b;
        } else if(flag==false){
            answer = a-(b);
        }

        return answer;
    }
}

/*
class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
*/
