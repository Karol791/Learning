using System;
using System.Collections.Generic;
using System.Text;

namespace trening2.klasy
{
    class Prostokat
    {


        public int A { get; }
        public int B { get; }

        public Prostokat(int a, int b)
        {
            A = a;
            B = b;
        }

        public override string ToString()
        {
            return base.ToString() + $" Prostokat o bokach a = {A} i b = {B}" ;
        }

        public int ob()
        {
            return (A * 2) + (B * 2);
        }
        public int pole()
        {
            return A * B;
        }
        virtual public void Info()
        {
            Console.WriteLine($" Prostokat o bokach a = {A} i b = {B}");
        }
    }
}
