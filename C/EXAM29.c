#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int getNumber() {
	return rand() % 45 + 1;
} // 1~45 �߿��� ���� �ϳ��� �����ϴ� �Լ�.
int main()
{
	short int lotto[6] = { 0, };
	int i, k, num;
	char dup = 'N'; //�ߺ�üũ -1

	printf("** �ζ� ��÷�� �����մϴ�. ** \n\n");
	srand((unsigned)time(NULL)); //����ð��� �������� rand() �Լ��� �ʱ�ȭ

	printf("*** time : %d ****\n", time);

	for (i = 0; i < 6;) {
		num = getNumber();

		for (k = 0; k < 6; k++)
			if (lotto[k] == num)
				dup = 'Y'; //�ߺ�üũ -2
		
		if (dup == 'N')
			lotto[i++] = num;
		else
			dup = 'N';
	}
	printf("��÷�� �ζ� ��ȣ ==> ");
	for (i = 0; i < 6; i++) {
		printf("%d ", lotto[i]);
	}
	printf("\n\n");
}