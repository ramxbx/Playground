#include <stdio.h>
int main() {
	//Type your code
  int a;
  int temp=1;
  scanf("%d",&a);
  while(a>0)
  {
  temp=temp*a;
  a--;
  }
  printf("%d",temp);
	return 0;
}