//ПП-12
//Марценюк Данило 
//Варіант 5(10)
#include <iostream>
using namespace std;
double ans(int **arr, int num) 
{
	int a = 0;
	int b = 0;
	int c = num;
	for (int i = 0; i < c; i++) {
		for (int j = 0; j < c; j++) {
			if (i == j) {
				a += arr[i][j];
			}
			if (i == (c - j - 1)) {
				b += arr[i][j];
			}
		}
	}
	return abs(a - b);
}
int getValue()
{
	while (true) 
	{
		int a;
		cin >> a;
		if (cin.fail()) 
		{
			cin.clear(); 
			cin.ignore(32767, '\n');
			cout << "Vvedite one more time\n";
		}
		else
		{
			cin.ignore(32767, '\n'); 
			return a;
		}
	}
}
int main()
{
	int num,menu; // размер массива
	cout << "Vvedite razmernost: ";
	num = getValue();
	
	int** arr = new int* [num];
	for (int i = 0; i < num; i++)
		arr[i] = new int[num];
	cout << "Zapolnyaem kak? \n";
	cout << "1. Rukami \n";
	cout << "2. Auto \n";
	cin >> menu;
	if (menu == 1)
	{
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num; j++)
			cin >> arr[i][j];
		}
	}
	if (menu == 2)
	{
		for (int i = 0; i < num; i++)
		{
			for (int j = 0; j < num; j++)
				arr[i][j] = rand() % 201 - 100;
		}		
	}
	cout << "Massiv" << endl;
	for (int i = 0; i < num; i++)
	{
		for (int j = 0; j < num; j++)
		{
			cout << arr[i][j] << " ";
		}
		cout << endl;
	}
	cout << ans(arr, num);
	delete[] arr;
	return 0;
}