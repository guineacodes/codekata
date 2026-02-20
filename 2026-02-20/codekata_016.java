[정수 내림차순으로 배치하기]


문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

문제 url
  https://school.programmers.co.kr/learn/courses/30/lessons/12933


row code 
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        for(int i = arr.length - 1; i >= 0; i--) {
            answer = answer * 10 + (arr[i] - '0');
        }
        
        return answer;
    }
}

//오름차순 정렬 - Arrays.sort(arr);
//숫자를 문자열로변환한뒤 문자 배열로 변환하고 오름차순정렬 그다음 다시 숫자만들기   
//숫자 배열로 바로 정렬하면 복잡해짐 (자리수, 나머지 등)
