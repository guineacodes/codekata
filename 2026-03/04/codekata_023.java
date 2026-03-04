핸드폰 번호 가리기

https://school.programmers.co.kr/learn/courses/30/lessons/12948

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
  
        int starLimit = phone_number.length() - 4;
        

        for(int i = 0; i < starLimit; i++) {
            answer += "*"; 
        }
        
        answer += phone_number.substring(starLimit);
        
        return answer;
    }
}
