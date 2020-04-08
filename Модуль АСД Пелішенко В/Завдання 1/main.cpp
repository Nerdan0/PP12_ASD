//ПП-12
//Пелішенко Владислав
//Варіант 1(12)
#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <math.h>

using namespace std;

int main(void) {
	srand(time(0));
	setlocale(LC_ALL, "Russian");
	int choice;
	int sum1 = 0, sum2 = 0;
	int n;
	int step = 0;
	
	cout << "Введите количество строк" << endl;
	cin >> n;
	int matrix[n][n];
			
	cout << "Желаете ли вы заполнить матрицу вручную?" <<  endl;
    cout << "Если да, введите 1, нет - 0";
    cin >> choice;
    if (choice == 1) {
        for (int i = 0; i < n; i++){
        	for (int j = 0; j < n; j++){
        		cout << "Введите число с индексом " << i << " " << j;
        		cin >> matrix[i][j];
			}
       	}
	} else if (choice == 0) {
		for (int i = 0; i < n; i++){
       		for (int j = 0; j < n; j++){
        		matrix[i][j] = rand()%201 -100;
        		cout << matrix[i][j] << " ";
        	}
        	cout << endl;
       	}
    }
    
    for (int i = 0; i < n; i++){
       	for (int j = 0; j < 1; j++){
       		sum1 += matrix[i][j + step];
       		step += 1;
       	}
    }
    for (int i = 0; i < n; i++){
       	for (int j = 0; j < n; j++){
       		if (i + j + 1 == n) {
       			sum2 += matrix[i][j];
       		}
       	}
	}
	cout << endl;
	cout << "Сумма элементов главной диагонали " << sum1 <<endl;
    cout << "Сумма элементов побочной диаголони" <<sum2 << endl;
    cout << "Абсолютная разница сумм диагоналей матрицы " << abs(sum1 - sum2);
}
