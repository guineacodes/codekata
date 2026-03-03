나누어 떨어지는 숫자 배열


문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

문제 url :
https://school.programmers.co.kr/learn/courses/30/lessons/12910

row code:
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        // 1. 나누어 떨어지는 요소 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        
        // 2. 비어있다면 -1 담아서 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        // 3. 오름차순 정렬
        Collections.sort(list);
        
        // 4. List를 int[]로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

//잘 모르겠음 혼자못쓰겠음.. Collections.sort(list) 오름차순정렬
//List, ArrayList, Collections -> java.util 임포트하기 
//배열을 돌면서 나누어 떨어지는지 조건필터링 + 예외처리 마지막으로 리스트를 배열로 변환
//왜 배열을안쓰지? -> 결과 개수를 미리 알 수 없기 때문에 리스트를 쓰면 일단 다 모아놓고 나중에 크기 확정 가능
