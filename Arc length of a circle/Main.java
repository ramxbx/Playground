#include <stdio.h>
#define pi 3.14
int main()
{
float a,b;
  scanf("%f %f",&a,&b);
  float sum=2*pi*a*(b/360);
  printf("%.2f",sum);
}