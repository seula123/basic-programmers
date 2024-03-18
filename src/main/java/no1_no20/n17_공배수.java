package no1_no20;

public class n17_공배수 {
    public int solution(int number, int n, int m) {

        if(number % n == 0 && number % m == 0){
            return 1;
        } else {
            return 0;
        }
    }
}
