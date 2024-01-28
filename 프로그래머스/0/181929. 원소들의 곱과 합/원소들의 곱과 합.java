class Solution {
    public int solution(int[] num_list) {
        long product = 1;
        long sum = 0;
        
        for (int num : num_list) {
            product *= num;
            sum += num;
        }
        
        long squareSum = sum * sum;
        
        if (product < squareSum) {
            return 1;
        } else {
            return 0;
        }
    }
}
