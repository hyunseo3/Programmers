class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int ame=0;
        int late=0;
        
        for(String coffee:order){
            if(coffee.contains("americano")||coffee.contains("anything")){
                ame+=1;
            }
            if(coffee.contains("latte")){
                late+=1;
            }
        }
        answer=ame*4500+late*5000;

        return answer;
    }
}