#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int left, int right) {
    int answer = 0;
    
    for(int i = left ; i <= right ; i++){
        int y = 0;
        for(int k = 1 ; k <= i ; k++){
            if(i%k==0)
                y++;
        }
        if(y%2==0)
          answer = answer+i;
        else
            answer=answer-i;
    }
    return answer;
}