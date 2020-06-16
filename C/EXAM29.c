#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int getNumber() {
	return rand() % 45 + 1;
} // 1~45 중에서 숫자 하나를 추출하는 함수.
int main()
{
	short int lotto[6] = { 0, };
	int i, k, num;
	char dup = 'N'; //중복체크 -1

	printf("** 로또 추첨을 시작합니다. ** \n\n");
	srand((unsigned)time(NULL)); //현재시간을 기준으로 rand() 함수를 초기화

	printf("*** time : %d ****\n", time);

	for (i = 0; i < 6;) {
		num = getNumber();

		for (k = 0; k < 6; k++)
			if (lotto[k] == num)
				dup = 'Y'; //중복체크 -2
		
		if (dup == 'N')
			lotto[i++] = num;
		else
			dup = 'N';
	}
	printf("추첨된 로또 번호 ==> ");
	for (i = 0; i < 6; i++) {
		printf("%d ", lotto[i]);
	}
	printf("\n\n");
}