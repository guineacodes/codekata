
문제url : https://school.programmers.co.kr/learn/courses/30/lessons/12935

class Solution {
    public int[] solution(int[] arr) {
        // 1. 만약 배열에 숫자가 하나뿐이라면, 제거 후 빈 배열이 되므로 [-1] 리턴
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        // 2. 배열에서 가장 작은 값(최솟값)이 무엇인지 먼저 찾습니다.
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { 
                min = arr[i];  
            }
        }

        // 3. 최솟값을 제외한 나머지 숫자들을 담을 배열 만들기 
        int[] answer = new int[arr.length - 1];
        
        // 4. 원래 배열(arr)을 돌면서 최솟값이 아닌 애들만 옮깁니다.
        int index = 0; // 새 바구니의 칸 번호입니다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                // 만약 지금 숫자가 최솟값이라면? 
                continue; 
            }
            answer[index] = arr[i];
            index++;
        }

        return answer;
    }
}

//// 1. 만약 배열에 숫자가 하나뿐이라면, 제거 후 빈 배열이 되므로 [-1] 리턴
//int[] temp = new int[1]; // 1. 크기가 1인 배열을 만든다.
//temp[0] = -1;           // 2. 그 첫 번째 칸에 -1을 넣는다.
//return temp;            // 3. 그 배열을 반환한다.
//이과정을 줄여서   if (arr.length <= 1) {return new int[]{-1} } 이렇게 적을수있다고 한다.. 
