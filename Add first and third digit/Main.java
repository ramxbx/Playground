#include<stdio.h>
int main()
{
  //Type your code here
  int a;
  scanf("%d",&a);
  int first=0;
  int last=0;
  first=a/100;
  last=a%10;
  printf("%d",first+last);
  return 0;
}