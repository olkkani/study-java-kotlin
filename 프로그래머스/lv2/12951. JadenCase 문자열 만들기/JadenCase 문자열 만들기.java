class Solution {
    public String solution(String s) {
              String[] sArr = s.split(" ");
        String answer = "";

        for (String s1 : sArr) {
            String[] arr = s1.split("");
            for (int i = 0; i < arr.length; i++) {
                if (i == 0){
                    answer += arr[i].toUpperCase();
                }else {
                    answer += arr[i].toLowerCase();
                }
            }
            answer += " ";
        }
        return answer;
    }
}