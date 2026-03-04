[자연수 뒤집어 배열로 만들기]

문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

 
문제url
https://school.programmers.co.kr/learn/courses/30/lessons/12932

raw code
 String str = String.valueOf(n);    
        int[] answer = new int[str.length()]; 
        int index = 0;

        while (n > 0) {
            answer[index++] = (int)(n % 10);
            n = n / 10;
        }

        return answer;
    }
}
