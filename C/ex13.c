#include<stdio.h>

int coffe_machin(int button)
{
	printf("\n# 1.(�ڵ�����) �߰ſ� ���� �غ��Ѵ�.\n");
	printf("# 2.(�ڵ�����) �������� �غ��Ѵ�.\n");

	switch (button)
	{
	case 1: printf("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��.\n"); break;
	case 2: printf("# 3.(�ڵ�����) ����Ŀ�Ǹ� ź��.\n"); break;
	case 3: printf("# 3.(�ڵ�����) ��Ŀ�Ǹ� ź��.\n"); break;
	default: printf("# 3. (�ڵ�����) �ƹ��ų� ź��.\n"); break;
	}

	printf("# 4.(�ڵ�����) ���� �״´�\n");
	printf("# 5.(�ڵ�����) ��Ǭ���� ��� ���δ�\n\n");

	return 0; //30������ ���ư���.
}

int main()
{
	int coffee;
	int ret;

	char nick[5];

	while (1)
	{
		printf("� Ŀ�Ǹ� �帱��� 1:����, 2:����, 3:�� 4.�ֹ� ����");
		scanf("%d", &coffee);

		printf("�г����� �����ֽʽÿ�(5���� �̳�)");
		scanf("%s", &nick);
		
		if(coffee == 4)
			break;

		ret = coffe_machin(coffee);

		printf("%s��~ Ŀ�� ���� �ֽ��ϴ�. \n\n", nick);
	}
}