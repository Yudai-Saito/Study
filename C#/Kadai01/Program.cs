using System;

namespace Kadai01
{
    class Program
    {
        static void Main(string[] args)
        {
            int FirstInputNum = (int)Convert.ToInt64(Console.ReadLine());
            int SecondInputNum = (int)Convert.ToInt64(Console.ReadLine());

            Console.WriteLine("add: " + (FirstInputNum + SecondInputNum));
            Console.WriteLine("sub: " + (FirstInputNum - SecondInputNum));
            Console.WriteLine("mult: " + (FirstInputNum * SecondInputNum));
            Console.WriteLine("div: " + (FirstInputNum / SecondInputNum));
        }
    }
}
