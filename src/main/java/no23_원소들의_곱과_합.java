public class no23_원소들의_곱과_합 {
    public int solution(int[] num_list) {
        int resultone = 0;
        int resulttwo = 1;

        for(int i = 0; i < num_list.length; i++) {
            resultone += num_list[i];
            resulttwo *= num_list[i];
        }

        if(resultone * resultone > resulttwo) {
            return 1;
        } else {
            return 0;
        }
    }
}
