package p1;

public class StudentApp {

	
	public static void main(String[] args) {
		
		/* add 5 subjects and calculate total marks 
		 *  and provide grades based on below conditions 
		 *  
		 *     1.   if below 50 :- fail 
		 *      2.  50-65 : B
		 *      3.   66-75 : B+
		 *      4.   75 & above :- A+
		 * 
		 * */
		
		
		
		int subject1 = 45;
		int subject2 = 65;
		int subject3 = 88;
		int subject4 = 74;
		int subject5 = 56;

		int total = (subject1+subject2+subject3+subject4+subject5);
		
		int avgMarks = total/5;
		
		String grade = "";
		
		
		if(avgMarks<50)
		{
			grade = "Fail";
		}
		else if(avgMarks>50 && avgMarks<=65)
		{
			grade = "B";
		}
		else if(avgMarks>66 && avgMarks<=75)
		{
			grade = "B+";
		}
		else if(avgMarks>75 )
		{
			grade = "A+";
		}
		
		System.out.println(" Total Marks "+total);
		System.out.println(" AvgMarks "+avgMarks);
		System.out.println(" Grade "+grade);
		
		
		
		
	}
}
