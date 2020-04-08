//ПП-12
//Пелішенко Владислав
//Варіант 1(12)
#include <iostream>
#include <math.h>

using namespace std;

int main(void) {
	setlocale(LC_ALL, "Russian");
	int marks;
	float mark;
	int part;
	
	cout << "Введите количество оценок студента" << endl;
	cin >> marks;
	
	int markArray[marks];
	int markArrayPast[marks];
	
	for (int i = 0; i < marks; i++){
		cout << "Введите оценку №" << i + 1 << " ";
		cin >> mark;
		markArray[i] = mark;
		markArrayPast[i] = mark;
	}
	
	for (int i = 0; i < marks; i++){
		if (markArray[i] > 40){
			int temp;
			int part;
			temp = (markArray[i] / 10) * 10;
			part = markArray[i] - temp;
			if (part <= 5) {
				markArray[i] = temp;
			} else if (part > 5) {
				markArray[i] = temp + 5;
			}
		}
	}
	
	cout << "---------------------------------------------" << endl;
	cout << "| # з/п    | Входной бал     | Результат    |" << endl;
	
	for (int i = 0; i < marks; i++){
		cout << "| " << i + 1 << "        | " << markArrayPast[i] << "              | " << markArray[i] << "           |" << endl;
	}
	cout << "---------------------------------------------";
	
}
