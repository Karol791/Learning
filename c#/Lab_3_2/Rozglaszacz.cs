using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_3_2
{
    class Rozglaszacz
    {


        public Func<int, bool> Predykat;

        private int flaga;

        public Rozglaszacz(Func<int, bool> predykat)
        {
            Predykat = predykat;
        }

        public int Flaga
        {
            get { return flaga; }
            set {
                flaga = value;
                //if(flaga > 10 && flaga < 20) 
                if (Predykat(flaga))
                {
                    //if (Zdarzenie1 != null)
                    //{
                    //    Zdarzenie1?.Invoke(flaga);
                    //}
                    Zdarzenie1?.Invoke(this, new MyEventArgs(flaga, $"Nastąpiło zdarzenie przy wartości {flaga}"));
                }
                        }
        }

        //public event Action<int> Zdarzenie1;
        public event EventHandler<MyEventArgs> Zdarzenie1;

    }
}
