using System;

namespace ConsoleApp5
{
    class Program
    {
        static void Main(string[] args)
        {
            string adres, maska;
            Console.WriteLine("Podaj swój adres: ");
            adres = Console.ReadLine();
            Console.WriteLine("Podaj swój adres maski: ");
            maska = Console.ReadLine();
            string[] octet = adres.Split('.');
            string[] octet2 = maska.Split('.');
            int[] negacja = new int[4];
            // 192.168.169.155 255.255.224.0
            int[] adresSieci = new int[4];
            int[] broadcast = new int[4];
            for(int i=0;i < octet.Length; i++)
            {
                adresSieci[i] = int.Parse(octet[i]) & int.Parse(octet2[i]);
                negacja[i] = ~int.Parse(octet2[i]) & 0xff;
                broadcast[i] = adresSieci[i] | negacja[i];
            }
            Console.WriteLine("Adres sieci to: ");
            for(int i=0;i < adresSieci.Length; i++)
            {
                if (i != adresSieci.Length - 1)
                {
                    Console.Write(adresSieci[i] + ".");
                }
                else
                {
                    Console.Write(adresSieci[i]);
                }
            }
            Console.WriteLine("\nAdres broadcast: ");
            for (int i = 0; i < broadcast.Length; i++)
            {
                if (i != adresSieci.Length - 1)
                {
                    Console.Write(broadcast[i] + ".");
                }
                else
                {
                    Console.Write(broadcast[i]);
                }
            }
        }
    }
}
