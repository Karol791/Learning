using System;
using System.Collections.Generic;

namespace lab_3_1
{
    class Program
    {
        delegate string MojDelegat1(int i, int j);

        static string Metoda1( int i , int j)
        {
            Console.WriteLine("wykonanie metody\"Metoda1\"");
            return i + "," + j;
        }
        string Metoda2(int i, int j)
        {
            Console.WriteLine("wykonanie metody\"Metoda2\"");
            return i + "," + j;
        }
        static void Akcja1(int k, string s)
        {
            Console.WriteLine("wykonanie metody \"Akcja1\"");
            Console.WriteLine($"argumenty: {k}, {s}");
        }
       void Akcja2(int k, string s)
        {
            Console.WriteLine("wykonanie metody \"Akcja2\"");
            Console.WriteLine($"argumenty: {k}, {s}");
        }

        static string Funkcja1(int k, string s)
        {
            Console.WriteLine("wykonanie \"Funkcja1\"");
            return $"podane argumenty: {k} i {s}";
        }
        static void Main(string[] args)
        {
            Program p = new();
            //MojDelegat1 m = Metoda1;
            //m += p.Metoda2;
            ////new MojDelegat1(Metoda1);
            //Console.WriteLine(m(1, 2));
            //m -= Metoda1;
            //Console.WriteLine("-------------------");
            //Console.WriteLine(m(1, 2));
            //List<MojDelegat1> lista = new();
            //lista.Add(Metoda1);
            //lista.Add(p.Metoda2);
            //Console.WriteLine("-------------------");
            //foreach (var item in lista)
            //{
            //    Console.WriteLine(item(1, 2));
            //}
            //Func<int, int, string> m = Metoda1;
            //m += p.Metoda2;
            //Console.WriteLine(m(2,3));
            //Action<int, string> m2 = Akcja1;
            //m2 += p.Akcja2;
            //Console.WriteLine("-------------------------");
            //m2(2, "test");
            //list<action<int, string>> lista2 = new();
            //lista2.add(akcja1);
            //lista2.add(p.akcja2);
            //foreach (var item in lista2)
            //{
            //    item(2, "test");
            //}
            List<Func<int, string, string>> lista3 = new();
            lista3.Add((a,b) => 
            {
                Console.WriteLine("wywkonanie \"lambdy\"");
                return $"podane argumenty: {a} i {b}";
            } );
            lista3.Add(Funkcja1);
            foreach (var item in lista3)
            {
                Console.WriteLine(item(1, "test"));
            }


        }
    }
}
