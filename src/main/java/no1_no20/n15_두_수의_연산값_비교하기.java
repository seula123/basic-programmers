package no1_no20;

public class n15_두_수의_연산값_비교하기 {
    public int solution(int a, int b) {

        String ab = String.valueOf(a) + String.valueOf(b);

        int iab = Integer.parseInt(ab);

        int ab2 = 2*a*b;

        if(iab>=ab2){

            return iab;
        } else {

            return ab2;
        }
    }
}
