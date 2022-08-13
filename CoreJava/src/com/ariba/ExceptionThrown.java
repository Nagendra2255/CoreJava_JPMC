package com.ariba;


class ExceptionThrown
{

static int divideByZero(int a, int b){

   int i=0    ;

 i = a/b;


System.out.println("hello4444");

return i;
}



static int computeDivision(int a, int b) {

int res =0;
 try



     {
 res = divideByZero(a,b);
 System.out.println("hello3333");
}
 catch(ArithmeticException ex)
 {
	 try
	 {
		 int a1=10/0;
	 }
	 catch(Exception e)
	 {
		 System.out.println("Sub exception");
	 }
	 finally
	 {
		 System.out.println("SUB FINALLY");
	 }
 System.out.println("hello9999");
 }
return res;
}
public static void main(String args[]){
int a = 1;
int b = 0;
try
{
int i = computeDivision(a,b);
System.out.println("hello1111");
}
// matching ArithmeticException

catch(ArithmeticException ex)
{
System.out.println("hello");
}
}
}