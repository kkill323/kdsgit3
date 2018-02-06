public class Main {

    public static void main(String[]args){
        //initializing n
        int n = 10;
        //utilizing a variable to get the system time before we execute the recursive factorial method
        long startTime=  System.nanoTime();
        //setting the value of the method to the value of a variable so I can output it
        double factorial = factorial(n);
        //output
        System.out.println("Factorial: " + factorial);
        // utilizing a variable to get the system time after we execute the recursive factorial method
        long endTime = System.nanoTime();
        //getting the time it took to run the method by subtracting startTime from endTime.
        long timeElapsed= endTime-startTime;
        //outputting time elapsed
        System.out.println("Elapsed time in nanoseconds is: " + timeElapsed);
        //converting time elapsed from nanoseconds to milliseconds
        System.out.println("Elapsed time in milliseconds is: " + timeElapsed/1000000);

        //running the iteration method
        double iteration = iteration(n);
        /* outputting the results of the iteration method
        Notice that we are not timing this method, you should practice and try and time this method yourself using the code above, so that you have
        a sense of how to do it.

        */


        System.out.println("Iteration Factorial: " + iteration);




    }
    //recursive method
    public static long factorial(int n) {
        //base case the factorial of 1 is 1, recall from the lecture the definition of a factorial
        if (n == 1) return 1;

        //returning n + multiplied by the factorial of n-1, notice how the method is being used within the method
        //This is a recursive method, it is calling it self.
        //So what does this say?
        return n * factorial(n-1);

    }

    //doing the same thing utilizing iteration


    public static long iteration(int n){

        int factorial = 1;

        for(int i = 1; i <=n; i++){

         factorial  = factorial *i;



        }

        return factorial;


    }

}
