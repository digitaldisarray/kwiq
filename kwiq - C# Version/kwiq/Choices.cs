using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace kwiq
{
    class Choices
    {
        public void ParseInput(String input)
        {
            // Store choice, and args that can later be passed to a feature.
            String[] args = input.Split(' ');

            // Check if the first character is an int.
            if (int.TryParse(args[0], out int choice))
            {
                // Input starts with a number.
                switch (choice)
                {
                    case 1:
                        Feature();
                        break;
                    case 2:
                        Feature();
                        break;
                    case 3:
                        Feature();
                        break;
                    case 4:
                        Exit();
                        break;
                }
            }
            else
            {
                // Input does not start with a number.
                Console.WriteLine(Settings.error + "Input must start with a number.");
                return;
            }
        }

        private void Feature()
        {
            Console.WriteLine("Wow! A feature!");
        }

        private void Exit()
        {
            Console.WriteLine(Settings.info + "Exiting...");
            Environment.Exit(1);
        }
    }
}
