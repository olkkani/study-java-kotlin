class Solution {
    public String solution(String[] survey, int[] choices) {
       String[] types = {"RT", "CF", "JM", "AN"};
        // A-Z 에 해당하는 int 배열 생성 (A:0, Z:26)
        int arr[] = new int[26];
        String answer = "";
        // 검사지 순서와 정답을 비교 후 각 배열에 값을 더함
        for (int i = 0; i < survey.length; i++) {
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            int value = Math.abs(choices[i] - 4);
            if (choices[i] >= 5){
                arr[b - 'A'] += value;
            } else if (choices[i] <= 3){
                arr[a - 'A'] += value;
            }
        }
        // 짝 타입을 비교하여 더 높은 값의 코드를 출력
        for (String type : types) {
            char a = type.charAt(0);
            char b = type.charAt(1);
            answer += arr[a - 'A'] >= arr[b - 'A'] ? a : b;
        }
        return answer;
    }
}