using System;
using System.Collections.Generic;
using System.Text;

namespace trening2.klasy
{
    class Kwadrat : Prostokat
    {
        public Kwadrat(int a) : base(a, a)
        {

        }
        public override string ToString()
        {
            return base.ToString() + $" Kwadrat o boku a = {A}";
        }

        public override void Info()
        {
            Console.WriteLine($" Kwadrat o boku a = {A}");
        }
    }
}
