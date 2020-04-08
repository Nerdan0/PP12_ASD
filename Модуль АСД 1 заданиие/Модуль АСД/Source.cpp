//Не судите строго, я не знаю почему но програма почему о делает разные значения только при обновление програмы. и не бейте сильно
#include "iostream"
#include "ctime"
#include "cstdlib"

using namespace std;

const int SIZE = 10;

void fillAndShowArray(int[][SIZE], const int size);
int findMinElement(int[][SIZE], const int size);
int findMaxElement(int[][SIZE], const int size);

int main()
{
	setlocale(LC_ALL, "rus");

	int matrix[SIZE][SIZE] = {};

	fillAndShowArray(matrix, SIZE); //заполняем и показываем массив

	cout << endl;
	cout << "Разница диагоналей " << findMinElement(matrix, SIZE) - findMaxElement(matrix, SIZE) << endl;


	return 0;
}

void fillAndShowArray(int arr[][SIZE], const int size)
{
	for (int i = 0; i < size; i++)
	{
		cout << "| ";
		for (int j = 0; j < size; j++)
		{
			arr[i][j] = -100 + rand() % -200;

			cout << arr[i][j] << " ";
		}
		cout << " |" << endl;
	}
}

int findMinElement(int arr[][SIZE], const int size)
{
	int min = arr[0][0];
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < size; j++)
		{
			if (arr[i][j] < min)
				min = arr[i][j];
		}
	}
	return min;
}

int findMaxElement(int arr[][SIZE], const int size)
{
	int max = arr[0][0];
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < size; j++)
		{
			if (arr[i][j] > max)
				max = arr[i][j];
		}
	}
	return max;
}

