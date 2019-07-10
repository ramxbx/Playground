#include <stdio.h>
#include <math.h>
int main() {
  int a;
  scanf("%d",&a);
  int temp=0;
  temp=a;
  int b=temp;
  int alpha=0;
    while(temp>0)
  {
  temp=temp/10;
   alpha++; 
  
  }
  temp=0;
  int sum=0;
  while(a>0)
  {
  temp=a%10;
    sum=sum + pow(temp,alpha);
  a=a/10;
  }
  if(b==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	//Type your code
	return 0;
}