package tester;

import acm.program.*;
public class PickMe extends ConsoleProgram
{
       public void run()
       {
               int pick = readInt("Enter 1 or 2 or 3: ");
               switch(pick)
               {
                   case 1:
                          println("Pick is 1!");
                          break;
                   case 2:
                           println("Pick is 2!");
                           break;
                    case 3:
                            println("Pick is 3!");
                            break;
                    default:
                             println("Pick must be 1 or 2 or 3!");
                }
           }
     }
