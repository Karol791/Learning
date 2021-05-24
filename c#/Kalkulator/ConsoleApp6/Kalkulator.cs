using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp6
{
    class Kalkulator
    {
        public static double Calc(double a, double b, int d)
        {
            double wynik = double.NaN;
            switch (d)
            {
                case 1: 
                    wynik =  a + b;
                    break;
                case 2:
                    wynik = a - b;
                    break;
                case 3:
                    wynik = a * b;
                    break;
                case 4:
                    if (b != 0)
                    {
                        wynik = a / b;
                    }
                        break;
                    
                default:
                    break;
            }
            return wynik;
        }
    }
}
