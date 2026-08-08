import java.io.*;

class Employee
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(br.readLine());

        int id[] = new int[n];
        String name[] = new String[n];
        double basic[] = new double[n];
        double net[] = new double[n];

        double total = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter ID: ");
            id[i] = Integer.parseInt(br.readLine());

            System.out.print("Enter Name: ");
            name[i] = br.readLine();

            System.out.print("Enter Basic Salary: ");
            basic[i] = Double.parseDouble(br.readLine());

            double da = basic[i] * 40 / 100;
            double hra = basic[i] * 20 / 100;
            double pf = basic[i] * 12 / 100;

            double gross = basic[i] + da + hra;
            net[i] = gross - pf;

            total = total + net[i];
        }

        System.out.println("\nID\tName\tBasic\tNet");

        for(int i = 0; i < n; i++)
        {
            System.out.println(id[i] + "\t" + name[i] + "\t" +
                               basic[i] + "\t" + net[i]);
        }

        int high = 0, low = 0;

        for(int i = 1; i < n; i++)
        {
            if(net[i] > net[high])
                high = i;

            if(net[i] < net[low])
                low = i;
        }

        System.out.println("Highest Paid = " + name[high]);
        System.out.println("Lowest Paid = " + name[low]);
        System.out.println("Average Salary = " + total / n);
    }
}
