import java.util.Scanner;

public class Assignment1 {
    @SuppressWarnings("resource")
	public static void main (String[] args) {
    
    	//initializing n
        long n;
        
        Scanner reader1 = new Scanner(System.in);
        System.out.println("enter a number to get its fibonacci series ");
        n = reader1.nextLong();
        //utilizing a variable to get the system time before we execute the recursive factorial method
        long startTime=  System.nanoTime();
        //setting the value of the method to the value of a variable so I can output it
       
        //output
       
        System.out.println("Fibonacci series up to " + n +" n : "); //printing Fibonacci series upto number for(int i=1; i<=number; i++){ System.out.print(fibonacci2(i) +" ");
        System.out.print(" fibanacci iterative method  ");
        for(int i=0; i<=n; i++){
            System.out.print(fiboSeriesIte(i) +", ");
        }
        // utilizing a variable to get the system time after we execute the recursive fibonacci method
        long endTime = System.nanoTime();
        //getting the time it took to run the method by subtracting startTime from endTime.
        long timeElapsed= endTime-startTime;
        //outputting time elapsed
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsed);
        //converting time elapsed from nanoseconds to milliseconds
        System.out.println("Elapsed time in milliseconds is: " + timeElapsed/1000000.0);

        //running the iteration method
        
        long startTime1=  System.nanoTime();
        System.out.print(" fibanacci recursive method  ");
        for(int i=0; i<=n; i++) {
        System.out.print(fiboSeriesRec(i) +", ");
        }
        long endTime1 = System.nanoTime();
        
        long timeElapsed1 = endTime1-startTime1;
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsed1);
        //converting time elapsed from nanoseconds to milliseconds
        System.out.println("Elapsed time in milliseconds is: " + timeElapsed1/1000000.0);
        }
       
    	
    
    



static long fiboSeriesIte(long n)
{
	if(n==0)
		return 0;
	else if(n==1||n==2) {
		return 1;
		
	}
	
    
 
    //returns the values of 0 and 1 when the Fibonacci series is or 1
      
    long firstPrev = 1;
    long secondprev = 1;
    
       // does a for loop to find for when your given 2 or greater to find the fibonacci series  
    for(int i= 3; i<= n; i++)
    {
       long result =firstPrev;
        firstPrev += secondprev;
        secondprev = result;
        // adds the value of the two previous values and prints it as the next value
        
    }
    return firstPrev;
}

static long fiboSeriesRec(long n)
{
	
	if(n==0)
		
	{
		return 0;
	}
	else if ((n == 1) || (n == 2)){
	
        return 1;
		 
	}
	
	

	return fiboSeriesRec(n-1) + fiboSeriesRec(n-2);
	
	//cite: code implemented from https-//gist.github.com/meghakrishnamurthy/331bd9addab3dbb1b6a23802b1c6845e
	
}
}
	
		
