없는 숫자 더하기

https://school.programmers.co.kr/learn/courses/30/lessons/86051

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=0 ; i < numbers.length ; i++){
            answer += numbers[i];
   }
        
            answer= 45 - answer ; 
      
        
        return answer;
    }
}

//0-9합 45에서 숫자들을 빼면 된다
