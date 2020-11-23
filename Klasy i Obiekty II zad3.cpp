#include <iostream>
#include <string>
using namespace std;

class Pracownik{
	private:
		string *imie;
		string *nazwisko;
	public:
		Pracownik(){
			imie = new string;
			imie = '\0';
			nazwisko = new string;
			nazwisko = '\0';
		}
		Pracownik(string im, string na){
			imie = new string[im.length()];
			*imie = im;
			nazwisko = new string[na.length()];
			*nazwisko = na;
		}
		Pracownik(const Pracownik &emp){
				imie = emp.imie;
				nazwisko = emp.nazwisko;
		}
		~Pracownik(){
			delete [] imie;
			delete [] nazwisko;
		}
		string poka(){
			cout << *imie << " " << *nazwisko << endl;
		}
};


int main(){
	Pracownik Ja("Karol","Majewski");
	//Ja.poka();
	Pracownik Klon(Ja);
	Klon.poka();
	
	
	return 0;
}
