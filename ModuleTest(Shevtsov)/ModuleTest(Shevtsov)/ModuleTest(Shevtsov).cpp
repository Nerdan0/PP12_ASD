// ModuleTest(Shevtsov).cpp : Этот файл содержит функцию "main". Здесь начинается и заканчивается выполнение программы.
//
//ShevtsovIvan group "ПП-12" 1st course
#include "pch.h"
#include <iostream>
#include <time.h>
using namespace std;
double getValueDouble()
{
	while (true) // цикл продолжается до тех пор, пока пользователь не введёт корректное значение
	{

		double a;
		cin >> a;

		// Проверка на предыдущее извлечение
		if (cin.fail()) // если предыдущее извлечение оказалось неудачным,
		{
			cin.clear(); // то возвращаем cin в 'обычный' режим работы
			cin.ignore(32767, '\n'); // и удаляем значения предыдущего ввода из входного буфера
			cout << "Oops, that input is invalid.  Please try again.\n";
		}
		else
		{
			cin.ignore(32767, '\n'); // удаляем лишние значения

			return a;
		}
	}
}
double getValueInt()
{
	while (true) // цикл продолжается до тех пор, пока пользователь не введёт корректное значение
	{

		int a;
		cin >> a;

		// Проверка на предыдущее извлечение
		if (cin.fail() || a > 10) // если предыдущее извлечение оказалось неудачным,
		{
			cin.clear(); // то возвращаем cin в 'обычный' режим работы
			cin.ignore(32767, '\n'); // и удаляем значения предыдущего ввода из входного буфера
			cout << "Oops, that input is invalid.  Please try again.\n";
		}
		else
		{
			cin.ignore(32767, '\n'); // удаляем лишние значения

			return a;
		}
	}
}
int getArrayIntValue()
{
	while (true) // цикл продолжается до тех пор, пока пользователь не введёт корректное значение
	{

		int a;
		cin >> a;

		// Проверка на предыдущее извлечение
		if (cin.fail() || a > 100 || a < 1) // если предыдущее извлечение оказалось неудачным,
		{
			cin.clear(); // то возвращаем cin в 'обычный' режим работы
			cin.ignore(32767, '\n'); // и удаляем значения предыдущего ввода из входного буфера
			cout << "Oops, that input is invalid.  Please try again.\n";
		}
		else
		{
			cin.ignore(32767, '\n'); // удаляем лишние значения

			return a;
		}
	}
}
int main()
{
	srand(time(0));
	int mainMenuVar, localVar , localVar2;
	cout << "1.Task 1\n2.Task 2\nEnter:";
	mainMenuVar = getValueDouble();
	system("cls");
	while (true) {
		switch (mainMenuVar) {
		case 1:
			cout << "1.About task\n2.Decision\n3.Back to the main menu\nEnter:";
			localVar = getValueDouble();
			if (localVar == 1) {
				system("cls");
				cout << "There are two arrays . Find common dividers .\n";
				break;
			}
			else if (localVar == 2) {
				system("cls");
				int size1 , size2;
				cout << "Enter first array`s size (but less than 10):";
				size1 = getValueInt();
				int *Arr1 = new int[size1];
				cout << "Randomize numbers ?\n1-Yes\n2-No\nEnter:";
				localVar2 = getValueInt();
				if (localVar2 == 1) {
					for (int i = 0; i < size1; i++) {
						Arr1[i] =  1 + rand() % 99;
					}
				}
				else if (localVar2 == 2) {
					for (int i = 0; i < size1;i++ ) {
						system("cls");
						cout << "Enter array`s number :";
						Arr1[i] = getArrayIntValue();
					}
					system("cls");
				}
				else if (localVar2 > 2) {
					cout << "There are no this case . Back to the menu . ";
					break;
				}
				cout << "Enter second array`s size (but less than 10):";
				size2 = getValueInt();
				int *Arr2 = new int[size2];
				cout << "Randomize numbers ?\n1-Yes\n2-No\nEnter:";
				localVar2 = getValueInt();
				if (localVar2 == 1) {
					for (int i = 0; i < size2; i++ ) {
						Arr2[i] = 1 + rand() % 99;
					}
				}
				else if (localVar2 == 2) {
					for (int i = 0; i < size2;i++ ) {
						system("cls");
						Arr2[i] = getArrayIntValue();
					}
					system("cls");
				}
				else if (localVar2 > 2) {
					cout << "There are no this case . Back to the menu . ";
					break;
				}
				cout << "Your first arrray:\n";
				for (int i = 0; i < size1; i++) {
					cout << Arr1[i];
					cout << "\t";
				}
				cout << "\n";
				cout << "Your second arrray:\n";
				for (int i = 0; i < size2; i++) {
					cout << Arr2[i];
					cout << "\t";
				}
				cout << "\n";
				if (Arr1[size1 - 1] > Arr2[0]) {
					cout << "Last element of the first array is bigger than first element of second array";
				}
				
				int i = Arr1[size1 - 1];
				int nextEl1 = 0;
				int nextEl2 = 0;
				cout << "Your elements :\n";
				while  (i < (Arr2[0] + 1) ) {
					while (nextEl1 < size1) {
						if (Arr2[nextEl2] % (i / Arr1[nextEl1]) == 0) {
							cout << i  ;
							cout << " when divided by " ;
							cout << Arr1[nextEl1];
							cout << "\n";
						}
						i++;
						nextEl1++;
					}
					nextEl1 = 0;
					nextEl2++;
				}
				
				cout << "\n";
					break;
			}
			else if (localVar == 3) {
				cout << "1.Task 1\n2.Task 2\nEnter:";
				mainMenuVar = getValueDouble();
				break;
			}
		case 2:
			cout << "1.About task\n2.Decision\n3.Back to the main menu\nEnter:";
			localVar = getValueDouble();
			if (localVar == 1) {

				break;
			}
			else if (localVar == 2) {
				break;
			}
			else if (localVar == 3) {
				mainMenuVar = getValueDouble();
				break;
			}
		
		default:
			system("cls");
			cout << "There is no task with this number.\n1.Task 1\n2.Task 2\n3.Task 3\nEnter:";
			mainMenuVar = getValueDouble();
		}
	}
	system("pause");
}

// Запуск программы: CTRL+F5 или меню "Отладка" > "Запуск без отладки"
// Отладка программы: F5 или меню "Отладка" > "Запустить отладку"

// Советы по началу работы 
//   1. В окне обозревателя решений можно добавлять файлы и управлять ими.
//   2. В окне Team Explorer можно подключиться к системе управления версиями.
//   3. В окне "Выходные данные" можно просматривать выходные данные сборки и другие сообщения.
//   4. В окне "Список ошибок" можно просматривать ошибки.
//   5. Последовательно выберите пункты меню "Проект" > "Добавить новый элемент", чтобы создать файлы кода, или "Проект" > "Добавить существующий элемент", чтобы добавить в проект существующие файлы кода.
//   6. Чтобы снова открыть этот проект позже, выберите пункты меню "Файл" > "Открыть" > "Проект" и выберите SLN-файл.
