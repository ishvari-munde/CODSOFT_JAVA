import java.util.Scanner ;
class StudGradeCalculator
{
public static void main(String args[])
{  
	Scanner sc = new Scanner(System.in);

	 System.out.println("please Enter the Total Number Of Subjects");
	 int totalSub = sc.nextInt();

	 int studMarks[] = new int[totalSub];

	 for(int i = 0; i < totalSub; i++)

	 {
	 	System.out.println("Subject " +(i+1)+ " marks =");
	 	studMarks[i] = sc.nextInt();
	 }

	 int marksSum = 0;

	 for(int i = 0; i < totalSub; i++)
	 {
	 	marksSum = marksSum + studMarks[i];
	 }

	 double percentage = (double)marksSum/totalSub; 

     char grade ;


     if(percentage > 85)
     {
     	grade = 'A';
     }
     else if (percentage >70)
     {
     	grade = 'B';
     }
     else
     {
     	grade = 'C';
     }


     System.out.println("Total marks ="+marksSum);
     System.out.println("Student percentage ="+percentage);
     System.out.println("Grade ="+ grade);
   }
}
 