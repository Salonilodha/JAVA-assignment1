import java.io.*;

class Array
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[10];
        int sum = 0, even = 0, odd = 0;

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter number: ");
            a[i] = Integer.parseInt(br.readLine());
            sum = sum + a[i];

            if(a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        int max = a[0];
        int min = a[0];

        for(int i = 1; i < 10; i++)
        {
            if(a[i] > max)
                max = a[i];

            if(a[i] < min)
                min = a[i];
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + sum / 10.0);
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

        System.out.print("Enter number to search: ");
        int n = Integer.parseInt(br.readLine());

        boolean found = false;

        for(int i = 0; i < 10; i++)
        {
            if(a[i] == n)
                found = true;
        }

        if(found)
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");

        System.out.println("Reverse Array:");

        for(int i = 9; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}
