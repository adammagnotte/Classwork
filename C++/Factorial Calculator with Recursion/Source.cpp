#include <iostream>
#include <conio.h>


using namespace std;


int fact(int x)
{
	//cout << "fact called with x = " << x << endl; 
	int result = 0;
	
	// Base Case
	if (x == 1)
		result = 1;
	//general equation
	else
		result = x * fact(x - 1);

	return result;
		
}
int main()
{
	int factor = 0;
	int res = 0;

	cout << "Please supply a positive integer value to calculate  its factorial value" << endl;
 	cin >> factor;

	res = fact(factor);

	cout << "This is the result of the factorial : " << res << endl;

	_getch();

	return 0;
}