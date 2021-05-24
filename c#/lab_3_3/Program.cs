using System;

namespace lab_3_3
{
    class Program
    {
        static void Akcja1(string s)
        {
            Console.WriteLine("\"Akcja1\"");
        }

        void Akcja2(string s)
        {
            Console.WriteLine("\"Akcja2\"");
        }
        static void Main(string[] args)
        {
            ActionsInvoker a = new();
            Action<string> k = s => { Console.WriteLine("\"lambda\""); };
            a.AddAction("jeden",k);
            Program p = new();
            a.AddAction("dwa", p.Akcja2);
            a.AddAction("jeden", Akcja1);
            Console.WriteLine("--------------------------------");
            a.InvokeActions();
            //Console.WriteLine("--------------------------------");
            //a.InvokeActions("jeden");
            a.RemoveAction("dwa", p.Akcja2);
            Console.WriteLine("++++++++++++++++++++++++++++++++++++++++++");
            a.InvokeActions();
        }
    }
}
