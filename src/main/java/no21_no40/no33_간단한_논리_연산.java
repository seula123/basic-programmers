package no21_no40;

public class no33_간단한_논리_연산 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 == true || x2 == true ) && (x3 == true || x4 == true );
        return answer;
    }
}
