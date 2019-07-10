#include <stdio.h>
int main() {
	//Type your code
  int a;
  int tens=0;
  scanf("%d",&a);
  tens=a/100;
  int temp=1;
  while(tens>0)
  {
  temp=temp*10;
    tens=tens/10;
    
  
  }
  temp=a/temp;
  temp=temp%10;
  printf("%d",temp);
	return 0;
}