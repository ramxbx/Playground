#include <stdio.h>
int main() {
 
  int a,b;
  int temp=1;
  int sum=0;
  scanf("%d",&a);
  int alpha;
  alpha=a;
  while(alpha>0)
  {
  b=alpha%10;
  //  printf("%d\n",b);
           while(b>0)
              {
                temp=temp*b;
     
                  b--;
               }
 b=0;
  //   printf("%d\n",temp);
    
  
  sum=sum+temp;
 temp=1;
    alpha=alpha/10;
  }
  if(sum==a)
 printf("Yes");
  else
    printf("No");
 //Type your code
	return 0;
}