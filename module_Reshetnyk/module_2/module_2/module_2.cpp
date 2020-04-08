#include <stdlib.h> 
#include <iostream>
using namespace std;
void choose();

void autoload() {
	int n, result, best=0, worst = 0;
	cout << "Enter the quantity of games"<< endl;
	cin >> n;
	for (int i = 0; i < n; i++) {
		 result = rand() % 1000 + 1;
		 if (best == 0 && worst == 0) {
			 best = result;
			 worst = result;
		 }
		 else {
			 if (result > best) {
				 best = result;
			 }
			 if (result < worst) {
				 worst = result;
			 }
		 }
		cout<<"game "<<i+1<<". result "<<result<<endl;
		cout << "best: " << best << ". worst: " << worst<<endl;
	}
	choose();
}

void manual() {
	int n, result, best = 0, worst = 0;
	cout << "Enter the quantity of games"<< endl;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cout << "Enter result of game " << i+1<<": ";
		cin >> result;
		if (best == 0 && worst == 0) {
			best = result;
			worst = result;
		}
		else {
			if (result > best) {
				best = result;
			}
			if (result < worst) {
				worst = result;
			}
		}
		cout << "game " << i + 1 << ". result " << result << endl;
		cout << "best: " << best << ". worst: " << worst << endl;
	}
	choose();
}

void choose() {
	int m;
	cout << "Enter 1 to generate games automatically" << endl << "Enter 2 to enter games manually" << endl;
	cin >> m;
	switch (m) {
	case 1:autoload();
	case 2:manual();
	default:
		cout << "error";
		choose();
	}
}

int main()
{
	
	choose();
}



