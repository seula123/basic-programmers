package no1_no20;

public class n18_홀짝에_따라_다른_값_반환하기 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i < n+1; i++) {
            if(n % 2 == 1 && i % 2 != 0){
                answer += i;
            } else if (n % 2 == 0 && i % 2 == 0){
                answer += i * i;
            }
        }

        return answer; // 최종 결과 반환
    }
}
