#include <stdio.h>
int main() {
	//Type your code
  int a;
  int tens=0;
  scanf("%d",&a);
  int last;
  last=a%10;
  tens=a/10;
  int temp=1;
  while(tens>0)
  {
  temp=temp*10;
    tens=tens/10;
    
  
  }
  temp=a/temp;
  
  printf("%d",temp+last);
	return 0;
}