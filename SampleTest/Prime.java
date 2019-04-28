public class Prime {

    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
            System.out.println("this is jagadish and i made a change");
        else
            System.out.println(num + " is not a prime number.");
            System.out.println("this is jagadish in the else loop");
        System.out.println("this is jagadish in the else loop");
        System.out.println("this is jagadish in the else loop");
        System.out.println("this is jagadish in the else loop");
        
    }
}
