import java.util.*;
import java.text.*;

class Login{
	public static void main(String[]args)throws IOException{
		Scanner s=new Scanner(System.in);
		int x=0;
		int y=0;
		boolean bool=true;
		boolean bool1=true;
		while(bool1){

		Faculty f1=new Faculty();
		Student s1=new Student();
		System.out.println("Student or Faculty:");
        String user=s.nextLine();
        if(user.equals("faculty")){
        	x=f1.login();
        }
        else if(user.equals("student")){
        	y=s1.login();
        }
        if(x==1)
        {
          while(true)
          {	
          System.out.println("Faculty Menu");
          System.out.println("Select the choice which you want to do");
          System.out.println("a.Modify the marks of the oneword and multiplechoice questionnare.");
          System.out.println("b.Add questions to the oneword question paper");
          System.out.println("c.Add questions to the multiple-choice question paper");
          System.out.println("d.Add a new student record with student details");
          char ch=s.next().charAt(0);
          switch(ch)
          {
          	case 'a' : f1.setMarks();
          	          break;

          	case 'b' : f1.addOneword();
          	          break;
          	case 'c' : f1.addMcq();
          	          break;
          	case 'd' : f1.addStudent();
          	          break;
          	 default : break;         
          }
          System.out.println("Do you want to enter more (y/n)");
          char ch1=s.next().charAt(0);
          if(ch1=='n'||ch1=='N')
          {
          	break;
          }
        }
       }
       else if(y==1){
        System.out.println("Student Menu");
        System.out.println("a.Take the Test");
        System.out.println("b.Display your mark");
        char ch3=s.next().charAt(0);
        switch(ch3)
           {
           	 case 'a': s1.takeExam();
           	           break;
           	 case 'b': s1.findmarks();
           	           break;
           	 default : break; }}

          System.out.println("Do you want to continue loggin in ? (y/n)");
          char ch5=s.next().charAt(0);
          if(ch5=='N'||ch5=='n')
          {
          	break;
          }
          }
}
}
