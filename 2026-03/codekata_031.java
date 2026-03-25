https://school.programmers.co.kr/learn/courses/30/lessons/12947


class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int original = x; 
        int sum = 0;      
        
        while (x > 0) {
            sum = sum + x % 10; 
            x= x / 10;      
        }
        
        if (original % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}
  
