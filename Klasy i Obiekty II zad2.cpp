#include <iostream>

using namespace std;

class Napis{
	private:
		char *napis;
	public:
		Napis(){
			napis = new char;
			napis = '\0';
		}
		Napis(char str[]){
			int n=sizeof(str) / sizeof(char);
			napis = new char[n];
			napis = str;
		}
			Napis(const Napis &nap, int n){
			napis[n] = nap.napis[n];
		}
		~Napis(){
			delete [] napis;
		}
		void doklej(char str[]){
			char *temp;
			int n1 = 0;
			while(char x = napis[n1] != '\0'){
				n1++;
			}
			temp = new char[n1];
			for(int i=0; i<n1;i++){
				temp[i] = napis[i];
			}
			delete [] napis;
			int n2 = 0;
			while(char x = str[n2] != '\0'){
				n2++;
			}
			napis = new char[n1+n2+1];
			for(int i=0;i<n1;i++){
				napis[i] = temp[i];
			}
			napis[n1] = ' ';
			for(int i = 0; i < n2; i++){
				napis[n1+i+1] = str[i];
			}
		}
		int dlugosc(){
			int n = 0;
			while(char x = napis[n] != '\0'){
				n++;
			}
			return n;
		}
		char poka(){
			int n =0;
			while(char x = napis[n] != '\0'){
				cout << napis[n];
				n++;
			}
			cout << endl;
		}
};

int main(){
	char str[] = "Programowanie jest fajne";
	char str2[] = "i satysfakcjonujace";
	Napis alejazda(str);
	alejazda.poka();
	alejazda.doklej(str2);
	alejazda.poka();
	Napis Same(alejazda);
	Same.poka();
	
	return 0;
}
