#include <stdio.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int temp=0;
  while(a>0)
  {
  temp=temp + a%10;
  a=a/10;
  }
  printf("%d",temp);
	return 0;
}