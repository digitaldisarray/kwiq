using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace kwiq
{
    class Program
    {
        static void Main(string[] args)
        {
            Choices c = new Choices();
            String input;
            
            Console.BackgroundColor = ConsoleColor.Black;
            Console.ForegroundColor = ConsoleColor.White;
            
            Console.WriteLine(Settings.title);
            while(true)
            {
                Console.WriteLine(Settings.menu);
                Console.Write(Settings.prompt);
                
                input = Console.ReadLine();
                
                c.ParseInput(input);
            }
        }
    }
}
