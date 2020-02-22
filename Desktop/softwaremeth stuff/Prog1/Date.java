/**
  
 @author  
 */
public class Date 
{
   private int  day;
   private int  month;
   private int  year;
   
   public Date(String d)
   {
      //use StringTokenizer to parse the String and create a Date object
      StringTokenizer st = new StringTokenizer(d,'/');
      int day = st.nextToken();
      int month = st.nextToken();
      int year = st.nextToken();
      this.day = day;
      this.month = month;
      this.year = year;


   }
   
   public Date(Date d)
   {
      //this is a constructor
       // ask if we can change constructor parameters

   }      
   
   public boolean isValid()
   {
       
   }
   
   @Override
   public String toString()
   {
       //use the format "month/day/year"
   }
   
   @Override
   public boolean equals(Object obj)
   {
       
   }  
}


