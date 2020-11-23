#include <iostream>

using namespace std;

class Napis{
	private:
		char *napis;
	public:
		Napis(char str[n], int n){
			napis = new char[n];
		}
		Napis(){
			napis[0];
		}
		Napis(const Napis &nap, int n){
			napis[n] = nap.napis[n];
		}
		
		~Napis(){
			
		}
		
};

int main(){
	char str[] = "Programowanie jest fajne";
	int n = sizeof(str) / sizeof(char);
	
	return 0;
}
