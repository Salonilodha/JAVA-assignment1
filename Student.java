import java.io.*;

class Student
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 0, marks;
        double per;

        for(int i = 1; i <= 5; i++)
        {
            System.out.print("Enter marks: ");
            marks = Integer.parseInt(br.readLine());
            total = total + marks;
        }

        per = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + per);

        if(per >= 90)
            System.out.println("Grade = A+");
        else if(per >= 80)
            System.out.println("Grade = A");
        else if(per >= 70)
            System.out.println("Grade = B");
        else if(per >= 60)
            System.out.println("Grade = C");
        else if(per >= 50)
            System.out.println("Grade = D");
        else
            System.out.println("Grade = Fail");

        if(per >= 50)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}