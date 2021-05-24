using System;

namespace Lab_3_2
{
    class Program
    {
       
        static void Main(string[] args)
        {
            //Rozglaszacz r = new(i => { return i >= 13; });
            //r.Zdarzenie1 += (o,m) => { Console.WriteLine(m.Message); };
            //Console.WriteLine("------przed ustawieniem na 1");
            //r.Flaga = 1;
            //Console.WriteLine("------przed ustawieniem na 13");
            //r.Flaga = 13;
            //Console.WriteLine("------przed ustawieniem na 10");
            //r.Flaga = 10;
            int k = 0;
            int? i = k;
            if (i.HasValue) k = i.Value;
            k = i ?? 0;
            k = i.GetValueOrDefault();

        }
    }
}
