//ПП-12
//Решетник Денис
//Варіант 2
//Завдання 1
#include <stdlib.h> 
#include <iostream>
using namespace std;
void choose();

void result(int* arr, int* arr2, int n, int m) {
	cout << endl;
	cout << "result:    "<<endl;
	int j = 0, check = 1, count =0;
	for (int i = arr[n-1]; i <= arr2[0]; i++) {
		check = 1;
		while (j<n) {
			if (i % arr[j] != 0) {
				check = 0;
				break;
			}
			j++;
		}
		j = 0;
		while (j < m) {
			if (arr2[j] % i != 0) {
				check = 0;
				break;
			}
			j++;
		}
		if (check == 1) {
			count++;
			cout << i << " " << endl;
		}
	}
	if(count == 0)
		cout << "there are no such numbers" << endl;
	choose();
}

void autoload() {
	int n, * arr, m, * arr2;
	cout << "Enter size of 1 array" << endl;
	cin >> n;
	arr = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = rand() % 100 + 1;
		cout << arr[i] << " ";
	}
	cout << endl;

	cout << "Enter size of 2 array" << endl;
	cin >> m;
	arr2 = new int[m];
	for (int i = 0; i < m; i++) {
		arr2[i] = rand() % 100 + 1;
		cout << arr2[i] << " ";
	}

	result(arr, arr2, n,m);
}

void manual() {
	int n, * arr, m, *arr2;
	cout << "Enter size of 1 array"<<endl;
	cin >> n;
	arr = new int[n];
	cout << "Enter elements of 1 array" << endl;
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	cout << endl;
	cout << "Enter size of 2 array" << endl;
	cin >> m;
	arr2 = new int[m];
	cout << "Enter elements of 2 array" << endl;
	for (int i = 0; i < m; i++) {
		cin >> arr2[i];
	}

	result(arr, arr2, n,m);
}

void choose() {
	int m;
	cout << "Enter 1 to generate arrays automatically" << endl << "Enter 2 to enter arrays manually" << endl;
	cin >> m;
	switch (m) {
	case 1:autoload(); 
		break;
	case 2:manual();
		break;
	default:
		cout << "error";
		choose();
	}
}

int main()
{
	choose();
}

