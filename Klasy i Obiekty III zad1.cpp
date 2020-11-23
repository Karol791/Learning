#include <iostream>

class Macierz{
	private:
		int il_wiersz;
		int il_kolumn;
		double dane;
	public:
		Macierz(int wiersze,int kolumny){
			il_wiersz = wiersze;
			il_kolumn = kolumny;
		}
		Macierz(const Macierz &M){
			il_wiersz = M.il_wiersz;
			il_kolumn = M.il_kolumn;
		}
		void setWartosc(int w, int k, double w){
			
		}
};


