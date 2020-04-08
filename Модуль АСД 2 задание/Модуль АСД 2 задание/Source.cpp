#include <iostream>
#include <time.h>
using namespace std;


int main()
{
	setlocale(LC_ALL, "Russian");
	const int size = 10;
	int a[size], i;
	cout << "Введите элементы первого массива:" << endl;
	for (i = 0; i < size; i++)
		cin >> a[i];
	cout << "Получены элименты перовго масива: " << endl;
	for (i = 0; i < size; i++)
		cout << "a[" << i << "]=" << a[i] << ' ';
	/////////


	cout << "Введите значения второго масива:" << endl;
	int b[size], j;
	for (j = 0; j < size; j++)
		cin >> b[j];
	cout << "Получены элименты второго масива: " << endl;
	for (j = 0; j < size; j++)
		cout << "b[" << j << "]=" << b[j] << ' ' << endl;
	///////


	cout << "Первый масив с автоматическим заполнением: " << endl;
	srand(time(NULL));
	int arr[10];
	for (int q = 0; q < 10; q++)
	{
		arr[q] = rand() % -100;
	}
	cout << "  ";
	for (int q = 0; q < 10; q++)
	{
		cout << arr[q] << "  ";
	}
	cout << endl;
	//////////


	cout << "Второй масив с автоматическим заполнением: " << endl;
	srand(time(NULL));
	int ar[10];
	for (int w = 0; w < 10; w++)
	{
		ar[w] = rand() % -100;
	}
	cout << "  ";
	for (int w = 0; w < 10; w++)
	{
		cout << ar[w] << "  ";
	}
	cout << endl;
	system ("pause");
}