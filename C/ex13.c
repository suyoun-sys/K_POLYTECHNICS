#include<stdio.h>

int coffe_machin(int button)
{
	printf("\n# 1.(자동으로) 뜨거운 물을 준비한다.\n");
	printf("# 2.(자동으로) 종이컵을 준비한다.\n");

	switch (button)
	{
	case 1: printf("# 3.(자동으로) 보통커피를 탄다.\n"); break;
	case 2: printf("# 3.(자동으로) 설탕커피를 탄다.\n"); break;
	case 3: printf("# 3.(자동으로) 블랙커피를 탄다.\n"); break;
	default: printf("# 3. (자동으로) 아무거나 탄다.\n"); break;
	}

	printf("# 4.(자동으로) 물을 붓는다\n");
	printf("# 5.(자동으로) 스푼으로 저어서 녹인다\n\n");

	return 0; //30행으로 돌아간다.
}

int main()
{
	int coffee;
	int ret;

	char nick[5];

	while (1)
	{
		printf("어떤 커피를 드릴까요 1:보통, 2:설탕, 3:블랙 4.주문 종료");
		scanf("%d", &coffee);

		printf("닉네임을 말해주십시오(5글자 이내)");
		scanf("%s", &nick);
		
		if(coffee == 4)
			break;

		ret = coffe_machin(coffee);

		printf("%s님~ 커피 여기 있습니다. \n\n", nick);
	}
}