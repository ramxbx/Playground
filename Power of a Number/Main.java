#include <stdio.h>
#include<math.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
 int c;
  c=pow(a,b);
  if(b<0)
  {
  printf("Wrong input");
  }
  else
  printf("%d",c);
  	//Your code here       
    return 0;
}