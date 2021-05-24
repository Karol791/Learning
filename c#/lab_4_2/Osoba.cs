using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab_4_2
{
    public class Osoba
    {
        public string Imie { get; }
        public string Nazwisko { get; }
        public string Opis { get; }

        public Osoba(string imie, string nazwisko, string opis)
        {
            Imie = imie;
            Nazwisko = nazwisko;
            Opis = opis;
        }
        public Osoba(string imie, string nazwisko)
        {
            Imie = imie;
            Nazwisko = nazwisko;
            Opis = "Osoba bez opisu";
        }
    }
}
