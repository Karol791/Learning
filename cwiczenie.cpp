#include <iostream>

using namespace std;

class Wskaznik{
	private:
		float *p;
	public:
		Wskaznik(float n){
			p = new float;
			*p = n;
			
		}
		Wskaznik(const Wskaznik &wsk){
			p=wsk.p;
		}
		~Wskaznik(){
			delete [] p;
		}
		float zwroc(){
			return * p;
		}
		float *ref(){
			return p;
		}
		void ustaw(float x){
			*p = x;
		}
};

int main(){
	Wskaznik wsk(4);
	cout << wsk.zwroc() << endl;
	cout << wsk.ref() << endl;
	Wskaznik wsk2(wsk);
	float x;
	cout << "Podaj wartosc" << endl;
	cin >> x;
	wsk.ustaw(x);
	cout << "wsk1: " << wsk.zwroc() << endl;
	cout << "wsk2: " << wsk2.zwroc() << endl;
}
