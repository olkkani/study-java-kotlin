import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};

        Set<String> dupleCheck = new HashSet<>();

        dupleCheck.add(words[0]);
        char fc;
        char lc = words[0].charAt(words[0].length() -1);

        int number= 0;
        int loop = 1;

        for (int i = 1; i < words.length; i++) {
            fc = words[i].charAt(0);
            if (fc != lc || dupleCheck.contains(words[i])){
                number = (i + 1) % n == 0 ? n : (i + 1) % n;
                break;
            }
            lc = words[i].charAt(words[i].length()-1);
            dupleCheck.add(words[i]);
            if((i + 1) % n == 0){
                loop ++;
            }
        }

        loop = number == 0 ? 0 : loop;
        
        answer = new int[]{number,loop};
        return answer;
    }
}