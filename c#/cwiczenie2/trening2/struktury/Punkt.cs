using System;
using System.Collections.Generic;
using System.Text;

namespace trening2.struktury
{
    struct Punkt
    {
        public int X { get; set; }
        public int Y { get; }

        public Punkt(int x, int y)
        {
            X = x;
            Y = y;
        }

        public override string ToString()
        {
            return base.ToString() + $"\"Punkt\" o współrzędnych [x,y]:[{X},{Y}]";
        }

        public void Info()
        {
            Console.WriteLine(ToString());
        }
    }
}
