package no21_no40;

public class no22_주사위_게임_2 {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if(a!=b && a!=c && b!=c ){
            answer = a+b+c;
        } else if(a==b && b==c){
            answer = (a + b + c) * (a*a + b*b + c*c ) * (a*a*a + b*b*b + c*c*c );
        } else {
            answer = (a + b + c) * (a*a + b*b + c*c );
        }

        return answer;
    }
}
