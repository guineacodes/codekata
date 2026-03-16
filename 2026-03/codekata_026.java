약수의 합

문제 url
  https://school.programmers.co.kr/learn/courses/30/lessons/12928

raw code
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1 ; i<=n ; i++){
            if(n % i  == 0){
            answer = answer + i ;
        }
      }
      
        return answer;
    }
}
