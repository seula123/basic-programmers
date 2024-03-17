package no1_no20;

public class n14_더_크게_합치기 {
    public int solution(int a, int b) {

        String ab = String.valueOf(a)+String.valueOf(b);
        String ba = String.valueOf(b)+String.valueOf(a);

        int abValue = Integer.parseInt(ab);
        int baValue = Integer.parseInt(ba);

        if(abValue > baValue){
            return abValue;
        }
        else{
            return baValue;
        }
    }
}
