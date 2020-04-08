#include <iostream>
#include <algorithm> 
using namespace std;
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
	int num1, num2, menu; // размер массива
	cout << "Vvedite razmernost pervoy: ";
	num1 = getValue();
	cout << "Vvedite razmernost vtoroy: ";
	num2 = getValue();
	int* n = new int[num1];
	int* m = new int[num2];
	cout << "Zapolnyaem kak? \n";
	cout << "1. Rukami \n";
	cout << "2. Auto \n";
	cin >> menu;
	if (menu == 1)
	{
		cout << "Vvedite perv" << endl;
		for (int i = 0; i < num1; i++)
		{
			cin >> n[i];
		}
		cout << "Vvedite vtor" << endl;
		for (int i = 0; i < num2; i++)
		{
			cin >> m[i];
		}
	}
	if (menu == 2)
	{
		for (int i = 0; i < num1; i++)
		{
			n[i] = rand() % 201 - 100;
		}
		for (int i = 0; i < num2; i++)
		{
			m[i] = rand() % 201 - 100;
		}
	}
	cout << "PERVAYA" << endl;
	for (int i = 0; i < num1; i++)
	{
		cout << n[i] << " ";
	}
	cout << endl << "VTORAYA" << endl;
	for (int i = 0; i < num2; i++)
	{
		cout << m[i] << " ";
	}
	sort(n, n + num1);
	sort(m, m + num2);
	cout << endl <<m[0] - n[(num1-1)]+1;

	cout << endl << "PERVAYA" << endl;
	for (int i = 0; i < num1; i++)
	{
		cout << n[i] << " ";
	}
	cout << endl << "VTORAYA" << endl;
	for (int i = 0; i < num2; i++)
	{
		cout << m[i] << " ";
	}
	delete[] n;
	delete[] m;
	return 0;
}
