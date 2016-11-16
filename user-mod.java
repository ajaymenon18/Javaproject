import java.util.*;
import java.text.*;
import java.io.*;

/* The interface is making problems */
interface Marks{
  int onewordmark=0;
  int multiplemark=0;
  int time=0;
}

abstract class User{
	String usertype;
	String username;
	String password;

	int login();
}

 class Faculty extends User implements Marks{

	Faculty(){
		this.usertype="faculty";
	}

	int login()
	     {
		int flag=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter username:");
		this.username=input.nextLine();
		System.out.println("Enter password");
		this.password=input.nextLine();
		String line;
		BufferedReader br=new BufferedReader(new FileReader("Faculty.txt"));
		while((line=br.readLine())!=null){
			String[] element=line.split(",");
			if((element[0].equals(this.username))&&(element[1].equals(this.password))){
				flag=1;
			}
		}
		return flag;
	}

	void setMarks(){
		    System.out.println("Enter the marks for one word question");
			int p=input.nextInt();
			this.onewordmark=p;
            System.out.println("Enter the marks for the multiple choice question");
            int q=input.nextInt();
            this.multiplemark=q;
		}
	
	
	void addOneword() throws IOException,FileNotFoundException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		boolean choice=true;

		while(choice){
			System.out.println("Enter the question:");
			String s=br.readLine();
			PrintWriter pw=null;
			try{
				File file=new File("oneword.txt");
           		FileWriter fw=new FileWriter(file,true);
				pw=new PrintWriter(fw);
		    	pw.println(s);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(pw!=null){
					pw.close();
				}
			}
			System.out.println("Enter the answer:");
			String s1=br.readLine();
			PrintWriter pw1=null;
			try{
				File file1=new File("oneword.txt");
           		FileWriter fw1=new FileWriter(file1,true);
				pw1=new PrintWriter(fw1);
		    	pw1.println(s1);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(pw1!=null){
					pw1.close();
				}
			}
			System.out.println("Do you want to enter more questions (y/n)");
			char ch=in.next().charAt(0);
			if((ch=='n')||(ch=='N')){
				choice=false;
			}
		}
	}

	void addMcq() throws IOException,FileNotFoundException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		boolean choice=true;

		while(choice){
			System.out.println("Enter the question:");
			String s=br.readLine();
			PrintWriter pw=null;
			try{
				File file=new File("mcq.txt");
           		FileWriter fw=new FileWriter(file,true);
				pw=new PrintWriter(fw);
		    	pw.println(s);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(pw!=null){
					pw.close();
				}
			}
			System.out.println("Enter the choices:");
			for(int i=0;i<4;i++){
				String s1=br.readLine();
				PrintWriter pw1=null;
				try{
					File file1=new File("mcq.txt");
           			FileWriter fw1=new FileWriter(file1,true);
					pw1=new PrintWriter(fw1);
		    		pw1.println(s1);
				}
				catch(IOException e){
					e.printStackTrace();
				}
				finally{
					if(pw1!=null){
						pw1.close();
					}
				}
			}
			System.out.println("Enter the answer:");
			String s2=br.readLine();
			PrintWriter pw2=null;
			try{
				File file2=new File("mcq.txt");
           		FileWriter fw2=new FileWriter(file2,true);
				pw2=new PrintWriter(fw2);
		    	pw2.println(s2);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(pw2!=null){
					pw2.close();
				}
			}
        }
        System.out.println("Do you want to enter more questions (y/n)");
		char ch=in.next().charAt(0);
		if((ch=='n')||(ch=='N')){
			choice=false;
		}
    }

    void addStudent() throws IOException,FileNotFoundException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner in=new Scanner(System.in);
		boolean choice=true;

		while(choice){
			System.out.println("Enter the username:");
			String s=br.readLine();
			PrintWriter pw=null;
			try{
				File file=new File("student.txt");
           		FileWriter fw=new FileWriter(file,true);
				pw=new PrintWriter(fw);
		    	pw.println(s);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(pw!=null){
					pw.close();
				}
			}
			System.out.println("Enter the password:");
			String s1=br.readLine();
			PrintWriter pw1=null;
			try{
				File file1=new File("student.txt");
           		FileWriter fw1=new FileWriter(file1,true);
				pw1=new PrintWriter(fw1);
		    	pw1.println(s1);
			}
			catch(IOException e){
				e.printStackTrace();
			}
			finally{
				if(pw1!=null){
					pw1.close();
				}
			}
			System.out.println("Do you want to add more students (y/n)");
			char ch=in.next().charAt(0);
			if((ch=='n')||(ch=='N')){
				choice=false;
			}
		}
    }
}




class Student extends User implements Marks{

	int marks;

	Student(){
		this.usertype="student";
	}

	int login()throws IOException{
		int flag=0;
		Scanner input=new Scanner(System.in);
		BufferedReader br8=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter username:");
		this.username=br8.readLine();
		System.out.println("Enter password");
		this.password=br8.readLine();
		String line;
		BufferedReader br=new BufferedReader(new FileReader("Student.txt"));
		while((line=br.readLine())!=null){
			String[] element=line.split(",");
			if((element[0]==this.username)&&(element[1]==this.password)){
				flag=1;
			}
		}
		return flag;
	}

	void takeExam()throws IOException,FileNotFoundException{
		System.out.println("Exam 1 :One word");
		BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
	    BufferedReader br2=new BufferedReader(new FileReader("oneword.txt"));
	    String line=new String();
	    while((line=br2.readLine())!=null)
	    {
	    	System.out.println("Question");
	    	System.out.println(line);
	    	String line1=br3.readLine();
	    	String line4=br2.readLine();
	    	if(line1.equals(line4))
	    	{
	    		marks=marks+this.onewordmark;

	    	}
	    }
	    System.out.println("Now underrgoing the multiplechoice question");
	    BufferedReader br4=new BufferedReader(new FileReader("mcq.txt"));
	    String line5;
	    while((line=br4.readLine())!=null)
	    {
	    	System.out.println("Question");
	    	System.out.println(line5);
	    	System.out.println("Choices");
	    	for(int i=0;i<4;i++)
	    	{
	    		String line6=br4.readLine();
	    		System.out.println(line6);
	    	}
           System.out.println("Enter the answer");
           String line7=br3.readLine();
           String line8=br4.readLine();
           if(line7.equals(line8))
           {
           	 marks=marks+multiplemark;
           }
	    }
		
	}
	void findmarks()
	{
		System.out.println("The final mark of the student with id"+this.username+"is"+marks);
		
	}

}




