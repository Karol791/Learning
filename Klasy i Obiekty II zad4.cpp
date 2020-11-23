#include <iostream>
#include <string>

using namespace std;

class Towar{
	private:
		string *nazwa;
		int liczba = 0;
	public:
		Towar(string n,int l){
			nazwa = new string[n.length()];
			*nazwa = n;
			liczba =l;
		}
		Towar(const Towar &T){
			nazwa = T.nazwa;
			liczba = T.liczba;
		}
		~Towar(){
			delete [] nazwa;
		}
		void drukuj(){
			cout << *nazwa << " Ilosc: " << liczba << endl;
		}
		bool czy_na_stanie(){
			if(liczba > 0){
				return true;
			}else{
				return false;
			}
		}
		void ustaw_liczbe(int l){
			liczba = l;
		}
		int zwroc_liczbe(){
			return liczba;
		}
		void sprzedano(int l){
			if(l > liczba){
				cout << "Nie mamy tyle towaru" << endl;
			}else{
				liczba -= l;
			}
		}
};


int main(){
	Towar T("Bulki",20);
	T.drukuj();
	T.sprzedano(10);
	T.drukuj();
	T.sprzedano(12);
	if(T.czy_na_stanie() > 0){
		cout << "Posiadamy " << T.zwroc_liczbe() << " sztuk tego towaru" << endl; 
	}else{
		cout << "Nie posiadamy tego towaru" << endl;
	}
	Towar T2(T);
	T2.drukuj();
	return 0;
}
