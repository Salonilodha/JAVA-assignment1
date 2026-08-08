import java.io.*;

class Number
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number: ");
        int n = Integer.parseInt(br.readLine());

        int ch;

        do
        {
            System.out.println("\n1 Prime");
            System.out.println("2 Palindrome");
            System.out.println("3 Armstrong");
            System.out.println("4 Sum of Digits");
            System.out.println("5 Reverse");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            ch = Integer.parseInt(br.readLine());

            switch(ch)
            {
                case 1:
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
                    break;

                case 2:
                    int x = n, rev = 0;
                    while(x > 0)
                    {
                        rev = rev * 10 + x % 10;
                        x = x / 10;
                    }

                    if(n == rev)
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 3:
                    int y = n, sum = 0;
                    while(y > 0)
                    {
                        int d = y % 10;
                        sum = sum + d * d * d;
                        y = y / 10;
                    }

                    if(n == sum)
                        System.out.println("Armstrong");
                    else
                        System.out.println("Not Armstrong");
                    break;

                case 4:
                    int z = n, s = 0;
                    while(z > 0)
                    {
                        s = s + z % 10;
                        z = z / 10;
                    }
                    System.out.println("Sum = " + s);
                    break;

                case 5:
                    int r = n, rev1 = 0;
                    while(r > 0)
                    {
                        rev1 = rev1 * 10 + r % 10;
                        r = r / 10;
                    }
                    System.out.println("Reverse = " + rev1);
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Wrong Choice");
            }
        }
        while(ch != 6);
    }
}