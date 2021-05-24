using System;
using trening2.klasy;
using trening2.struktury;

namespace trening2
{
    class Program
    {
        static void Main(string[] args)
        {
            Punkt p1 = new Punkt(2, 5);
            Punkt p2 = p1;
            p1.X = 123;
            p1.Info();
            Console.WriteLine(p2.ToString());
            Prostokat pr1 = new Prostokat(2, 7);
            Prostokat pr2 = pr1;
            //Console.WriteLine(pr1.ToString());
            //Console.WriteLine(pr2.ToString());
            //Console.WriteLine(pr1.ob());
            //Console.WriteLine(pr1.pole());
            Kwadrat kw1 = new Kwadrat(4);
            //Console.WriteLine(kw1.ToString());
            pr1.Info();
            kw1.Info();
            Prostokat pr3 = new Kwadrat(5);
            pr3.Info();
        }
    }
}
