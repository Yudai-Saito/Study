using System;

namespace Kadai02
{
    class Program
    {
        static void Main(string[] args)
        {
            float FirstInputNum = (float)Convert.ToInt64(Console.ReadLine());
            float SecondInputNum = (float)Convert.ToInt64(Console.ReadLine());

            Console.WriteLine("add: " + (FirstInputNum + SecondInputNum));
            Console.WriteLine("sub: " + (FirstInputNum - SecondInputNum));
            Console.WriteLine("mult: " + (FirstInputNum * SecondInputNum));
            Console.WriteLine("div: " + (FirstInputNum / SecondInputNum));
        }
    }
}
