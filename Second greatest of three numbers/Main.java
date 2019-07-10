#include <stdio.h>
 
void main()
{
    int num1, num2, num3;
 int flag=0;
  
    scanf("%d %d %d", &num1, &num2, &num3);
   
   if(num1>num2)
      flag=num1;
  else 
    flag=num2;
  
    if(flag<num3)
    {   printf("%d",flag); }
   else
   { printf("%d",num3);}
  
  
  
}