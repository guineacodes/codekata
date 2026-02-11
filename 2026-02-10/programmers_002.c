[몫 구하기]

정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.

제한사항
0 < num1 ≤ 100
0 < num2 ≤ 100

문제 url 
https://school.programmers.co.kr/learn/courses/30/lessons/120805

raw code
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;
    answer = num1 / num2 ;
    return answer;
}
