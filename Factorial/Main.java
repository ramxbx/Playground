#include<stdio.h>
int main()
{ 
  long int a,i;
  long int sum=1;
  scanf("%d",&a);
  for(i=1;i<a+1;i++)
  {
  sum*=i;
  // printf("%d",i);
  }
  printf("%ld",sum);
	//your code here
}