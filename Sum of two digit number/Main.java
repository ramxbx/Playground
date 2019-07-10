#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int first;
  int last;
  first=a/10;
  last=a%10;
  printf("%d",first+last);
  //Type your code here
  return 0;
}