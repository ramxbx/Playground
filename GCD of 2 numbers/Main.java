// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<math.h>
// Main function
int min(int,int);
int main()
{
   int a,b;
  scanf("%d %d",&a,&b);
  int s=min(a,b);
 // int p=s/a;
  
  //s++;
  //printf("%d    ",p);
  while(s>0)
  {
  // printf("%d ",s);
  if(a%s==0 && b%s==0)
  {  printf("%d",s);
  break;
  }
    s--;
  //else
   // s=s-1;
  }
  // Enter your code here 
  
   return 0;
}
int min(int x, int y) 
{ 
  return (x < y) ? x : y; 
} 