package asterisk;

  public class Asterisk {
    
    public int asterisk(int n) { 
        
        int i,j; 
        int rows = 4;
        
        for(i=0; i<n; i++) 
        {
            for(j=0; j<=i; j++) 
            {  
                System.out.print("* "); 
            }  
            System.out.println(); 
        } 
        for(i = 1; i <= rows; ++i) {
            for(j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
           for(i = 3; i >= 1; --i) {
            for( j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
      return 0;
    }
    public int Asterisk(int n) { 
        
     int r = 5; 
     int i = 1;
     int j = 1;
       
     {
       while (i <= r)
       {
        while (j <= i )
        {
            System.out.print("* ");
            ++j;
        }
            System.out.print("\n");
            i++;
            j = 1;
     }
     int a = 4;
     int b =1;
       
       while (a >= 1)
       {
        while (b <= a)
        {
            System.out.print("* ");
            ++b;
        }
            System.out.print("\n");
             --a;
            b = 1;
        }
     }
     return 0;
   }
    
      public double asterisk(double x, double y)
    {
        int i = 0, j = 0;
        do
     {
         do
             {
                 System.out.print("*");
                 j++;
             }
         while(j<=i);
         j=0;
         System.out.print("\n");
         i--;
     }
     while(i>=j);
     j=0; i=0;
     do
     {
         do
         {
             System.out.print("*");
             j++;
         }
         while(j!=i+1);
         j=0;
         i++;
         System.out.print("\n");
     }
     while(i!=5);
        return (0);
    }
    
 
     public static void main(String args[]) {
         
        Asterisk n = new Asterisk();
           System.out.println(n.asterisk(1));
           System.out.println(n.asterisk(2));
           System.out.println(n.asterisk(3));
      }
  }
          
 


        
 




