package tester;
import acm.program.*;
      public class TempCheck extends ConsoleProgram
      {
              public void run()
             {
                    double newTemp = readDouble("Enter a temperature: ");
                    if (newTemp > 72); 
                     {
                             println("Too Hot!");
                      }
                     if(newTemp < 72); 
                     {
                           println("Too cold!");
                      }
                     if(newTemp == 72); 
                     {
                           println("Just right!");
                      }
             }
         }
