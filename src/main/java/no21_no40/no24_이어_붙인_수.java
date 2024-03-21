package no21_no40;

public class no24_이어_붙인_수 {
    public int solution(int[] num_list) {
        int answer = 0;

        String odd = "";
        String even = "";

        for(int i=0; i<num_list.length; i++){

            if(num_list[i]%2==0){
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }

        answer = Integer.parseInt(odd)+Integer.parseInt(even);

        return answer;
    }
}
