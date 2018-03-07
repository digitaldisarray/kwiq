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

            // Create an instance of the choices.
            Choices c = new Choices();

            // Variable to store the user input.
            String input;

            // Print the title.
            Console.WriteLine(Settings.title);
            while(true)
            {
                // Print the menu and the prompt.
                Console.WriteLine(Settings.menu);
                Console.Write(Settings.prompt);

                // Get the user's choice.
                input = Console.ReadLine();

                // Pass input to the program class.
                c.ParseInput(input);
            }
        }
    }
}
