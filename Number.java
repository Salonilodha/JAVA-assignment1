import java.io.*;

class Number
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, choice;

        System.out.print("Enter number: ");
        n = Integer.parseInt(br.readLine());

        System.out.println("1. Prime");
        System.out.println("2. Palindrome");
        System.out.println("3. Armstrong");
        System.out.println("4. Sum of digits");
        System.out.println("5. Reverse");

        System.out.print("Enter choice: ");
        choice = Integer.parseInt(br.readLine());

        if(choice == 1)
        {
            int count = 0;

            for(int i = 1; i <= n; i++)
            {
                if(n % i == 0)
                    count++;
            }

            if(count == 2)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }

        else if(choice == 2)
        {
            int temp = n;
            int rev = 0;

            while(n > 0)
            {
                int r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
            }

            if(temp == rev)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }

        else if(choice == 3)
        {
            int temp = n;
            int sum = 0;

            while(n > 0)
            {
                int r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }

            if(temp == sum)
                System.out.println("Armstrong");
            else
                System.out.println("Not Armstrong");
        }

        else if(choice == 4)
        {
            int sum = 0;

            while(n > 0)
            {
                sum = sum + n % 10;
                n = n / 10;
            }

            System.out.println("Sum = " + sum);
        }

        else if(choice == 5)
        {
            int rev = 0;

            while(n > 0)
            {
                int r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
            }

            System.out.println("Reverse = " + rev);
        }

        else
        {
            System.out.println("Wrong choice");
        }
    }
}
