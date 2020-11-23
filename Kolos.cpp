#include <iostream>
#include <cstddef>
using namespace std;
class Printable{
	public:
		virtual ~Printable(){}
		virtual void print() = 0;
	
};

class Fraction: public Printable{
	private:
		int licznik;
		int mianownik;
	public:
		Fraction(int licznik, int mianownik){ // konstruktor
			this -> licznik = licznik;
			this -> mianownik = mianownik;
		}
		Fraction(){}
		void print(){ // metoda print
			cout << "Licznik: " << licznik << " Mianownik: " << mianownik << endl;
		}
		int getlicznik(){ // metoda zwracaj¹ca licznik
			return licznik;
		}
		int getmianownik(){ // metoda zwracaj¹ca mianownik
			return mianownik;
		}
		void setmianownik(int mianownik){ // metoda ustawiaj¹ca mianownik
			this -> mianownik = mianownik;
		}
		void setlicznik(int licznik){ // metoda ustawiaj¹ca licznik
			this -> licznik = licznik;
		}
		Fraction operator -(const Fraction & F){ // operator odejmowania
			return Fraction(this -> licznik - F.licznik, this -> mianownik - F.mianownik);
		}
};


class FractionList{
	private:
		Fraction *ulamek;
		size_t size;
	public:
		FractionList(size_t size){ // konstruktor
			this -> size = size;
			ulamek = new Fraction[size];
		}
		size_t zwrocsize(){ // metoda zwracaj¹ca wielkosc tablicy
			return size;
		}
		FractionList(const FractionList &F){ // konstruktor kopiuj¹cy
			ulamek = F.ulamek;
			size = F.size;
		}
		~FractionList(){ //destruktor
			delete [] ulamek;
		}
		Fraction operator [](size_t size){ // operator []
			return ulamek[size];
		}
};



int main(){
	int X=18041%8;
	cout << "X = " << X << endl;
	int licznik;
	int mianownik;
	int il_ulamkow=0;
	cout << "Podaj ilosc ulamkow: " << endl;
	cin >> il_ulamkow;
	FractionList ulamki(il_ulamkow); // Tworzenie obiektu klasy
	for(int i=0;i<il_ulamkow;i++){ // Przypisanie dla kazdego elemntu tablicy licznika i mianownika
		cout << "Podaj "<< i+1 << " licznik" << endl;
		cin >> licznik;
		ulamki[i].setlicznik(licznik);
		cout << "Podaj "<< i+1 << " mianownik" << endl;
		cin >> mianownik;
		ulamki[i].setmianownik(mianownik);
	}
	ulamki[0] - ulamki[1];
	ulamki[0].print(); // wyswietlenie u³amka

	return 0;
}
