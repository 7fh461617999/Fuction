package Jobsheet12;
import java.util.Scanner;
public class CubeStudent11 {
    static String[] Students ;
    static int[][] grades ;
    public static void InputGrades(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Enter "+Students[i]+" grade in week "+(j+1)+" : ");
                grades[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
    }
    public static void showGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println(Students[i]);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("Week "+(j+1)+" grade :"+ grades[i][j]);
            }
            System.out.println();
        }
    }
    public static void findHighestWeek(){
        int max=0;
        int weekFound = 0;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                    weekFound = j+1;
                }
            }
        }
        System.out.println("the highest grade was found in week " +weekFound+" with the value :"+max);
    }
    public static void findHighestStudent(){
        // find who is the highest
        int sum[]= new int[grades.length];
        int max = 0;
        int student =0;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                sum[i] +=grades[i][j]; 
            }
            if (sum[i] > max) {
                max = sum[i];
                student = i;
            }
        }
        System.out.println("The highest score from "+ Students[student]);
        for (int i = 0; i < grades[student].length; i++) {
            System.out.println("week "+i+1+" is : "+grades[student][i]);
        }
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of Student : ");
    int nStudent = sc.nextInt();
    System.out.println("Enter the number of Week : ");
    int nWeek = sc.nextInt();
    String Students[] = new String[nStudent];
    int grades[][] =new int[nStudent][nWeek];
    sc.nextLine();
    for (int i = 0; i < grades.length; i++) {
        System.out.print("input name of Student "+ i+1 +" : ");
        Students[i]=sc.nextLine();
    }  
    InputGrades();
    showGrades();
    findHighestWeek();
    findHighestStudent();
    sc.close();
 }   
}
