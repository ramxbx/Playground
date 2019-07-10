#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f %f",&a,&b);
  float c;
  c= pow(a,2) + pow(b,2);
    c=sqrt(c);
  printf("%.2f",c);
  //Type your code here
  return 0;
}