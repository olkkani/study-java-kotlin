class Solution {
    public String solution(String s) {
        
        String[] arr = s.split(" ");
        
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            int item = Integer.parseInt(arr[i]);
            
            if (item < min){
                min = item;
            } else if (item > max){
                max = item;  
            }
        }
        return min + " " + max;
    }
}