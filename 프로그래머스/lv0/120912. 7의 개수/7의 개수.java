class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a:array){
         String arr = String.valueOf(a);
            for(int i=0;i<arr.length();i++){
                if(arr.charAt(i)=='7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}