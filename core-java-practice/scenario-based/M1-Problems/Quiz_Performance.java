import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name, dept;
    int q1,q2,q3;

    Student(String name,String dept,int q1,int q2,int q3){
        this.name=name;
        this.dept=dept;
        this.q1=q1;
        this.q2=q2;
        this.q3=q3;
    }

    int total(){
        return q1+q2+q3;
    }
}

public class Quiz_Performance {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        ArrayList<Student> list=new ArrayList<>();

        for(int i=0;i<n;i++){

            String[] p=sc.nextLine().split(" ");

            if(p[0].equals("Record")){

                String name=p[1];
                String dept=p[2];
                int q1=Integer.parseInt(p[3]);
                int q2=Integer.parseInt(p[4]);
                int q3=Integer.parseInt(p[5]);

                list.add(new Student(name,dept,q1,q2,q3));

                System.out.println("Record Added: "+name);
            }

            else if(p[0].equals("Top")){

                if(list.isEmpty()){
                    System.out.println("No Records Available");
                    continue;
                }

                String type=p[1];

                if(type.equals("Q1")||type.equals("Q2")||type.equals("Q3")){

                    int max=-1;

                    for(Student s:list){

                        int score=0;

                        if(type.equals("Q1")) score=s.q1;
                        if(type.equals("Q2")) score=s.q2;
                        if(type.equals("Q3")) score=s.q3;

                        max=Math.max(max,score);
                    }

                    for(Student s:list){

                        int score=0;

                        if(type.equals("Q1")) score=s.q1;
                        if(type.equals("Q2")) score=s.q2;
                        if(type.equals("Q3")) score=s.q3;

                        if(score==max)
                            System.out.println(s.name+" "+score);
                    }
                }

                else{

                    String dept=type;
                    int max=-1;
                    boolean found=false;

                    for(Student s:list){

                        if(s.dept.equals(dept)){
                            found=true;
                            max=Math.max(max,s.total());
                        }
                    }

                    if(!found){
                        System.out.println("Department Not Found");
                        continue;
                    }

                    for(Student s:list){

                        if(s.dept.equals(dept) && s.total()==max)
                            System.out.println(s.name+" "+s.total());
                    }
                }
            }
        }
    }
}