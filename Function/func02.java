//Example of function in the same class
class func02 {

public static void main(String args[])
{
int a=5;int b=10;
int result = calculate(a,b); // calling the function
System.out.println(result);
a=50;b=100;
result = calculate(a,b);
System.out.println(result);
}
//declaring the function parameterised with return value
static int calculate(int a, int b)
{
int z=0;
if(a > b)
z = a/b;
else if(a < b)
z = a + b;
else 
z = a * b;
return z;
}


}