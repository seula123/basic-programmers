package no21_no40;

public class no27_수_조작하기_2 {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i=0; i<numLog.length-1; i++){
            if(numLog[i+1]-numLog[i]==1){
                answer+="w";
            }else if (numLog[i+1]-numLog[i]==-1){
                answer+="s";
            } else if (numLog[i+1]-numLog[i]==10){
                answer+="d";
            } else if (numLog[i+1]-numLog[i]==-10){
                answer+="a";
            }
        }

        return answer;
    }

}

/*
 for(i=0; i<numLog.length-1; i++){
        const subtraction = numLog[i+1]-numLog[i];
        if(subtraction===1){
            result += "w"
        } else if (subtraction===-1){
            result += "s"
        } else if (subtraction===10){
            result += "d"
        } else if(subtraction===-10) {
            result += "a"
        }
    } return result
*/