/**
  
 @author  
 */
 
public class ProjectManager
{
   std.out.println("Lets start a Team");
   Scanner stdin;
   Team cs213;
   public void run()
   {
       
      boolean done = false;
      while ( !done )
      {
         String command = stdin.next();
         switch (command)
         {   
            case 'A': add(stdin.next(),stdin.next());
		      break; 
            case 'R': remove();
               break;
            case 'P': print();
               break;
            case 'Q': print() std.out.println("The team is ready to go!");
               break;
            default: //deal with bad command here 
         }  
      }
      //write java code before you terminate the program
   } //run()
   
   private void add(String name, String date)
   {

      	//must check if the date is valid
	//must call the contains() method to check if a given 
	//team member is in the team already
   }
   
   private void remove()
   {
      //must check if the date is valid
	   
   }
   
   private void print()
   {
      //must check if the team has 0 members. 
   }   
} //ProjectManager
