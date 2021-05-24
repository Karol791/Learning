namespace Lab_3_2
{
    public class MyEventArgs
    {
        public int Arg { get; }
        public string Message { get; }

        public MyEventArgs(int arg, string message)
        {
            Arg = arg;
            Message = message;
        }
    }
}