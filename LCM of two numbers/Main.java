#include<stdio.h>
int min(int,int);
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  //int i,s;

 int p=(a*b)/min(a,b);
  printf("%d",p);
  //Type your code here
  return 0;
}
int min(int x, int y)
{
 int i,s;
  s=(x<y)?x:y;
  for(i=s;i>0;i--)
  {
  if(x%i==0 && y%i==0)
  { 
 return i;
   break; }
  
  }

   // return 1;
}