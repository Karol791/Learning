using System;

namespace ConsoleApp6
{
    class Program
    {
        static void Main(string[] args)
        {
            int d=0;
            bool END = false;
            while (!END)
            {
                string number1 = "";
                string number2 = "";
                double wynik = 0;

                Console.Write("Podaj pierwszą liczbę: ");
                number1 = Console.ReadLine();
                double a = double.Parse(number1);

                Console.Write("Podaj drugą liczbę: ");
                number2 = Console.ReadLine();
                double b = double.Parse(number2);

                Console.Write("Co chcesz zrobić?\n" +
                    "1 - Dodawanie\n" +
                    "2 - Odejmowanie\n" +
                    "3 - Mnożenie\n" +
                    "4 - Dzielenie\n");
                d = int.Parse(Console.ReadLine());
                wynik = Kalkulator.Calc(a, b, d);
                if(d == 1)
                {
                    Console.WriteLine(a + " + " + b + " = " + wynik);
                }else if(d == 2)
                {
                    Console.WriteLine(a + " - " + b + " = " + wynik);
                }else if(d == 3)
                {
                    Console.WriteLine(a + " * " + b + " = " + wynik);
                }
                else
                {
                    Console.WriteLine(a + " / " + b + " = " + wynik);
                }
                Console.WriteLine("Wpisz 'koniec' i wciśnij Enter aby zakończyć, jeśli chcesz kontynuuować naciśnij Enter");
                if(Console.ReadLine() == "koniec")
                {
                    END = true;
                }

            }
        }
    }
}
