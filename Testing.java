import java.util.*;

/**
 * Testing
 */
public class Testing {

    public static long sumLtoR(Long l,Long r){
        long sum=0;
        if(l<r){
            for(long i=l;i<=r;i++){
                sum+=i;
            }
        }
        return sum;
    }
    public static long sumLtor2(Long l , Long r)
    {
        long s1=(l*(l-1)/2);
        long s2=(r*(r+1)/2);
        long sum2=(s1-s2);
        return sum2;
    }  
    


    // A company  decides to give bonus to all its employees on new year.
    //  A 5% bonus on salary is given to male workers and 10% bonus on salary is given to female workers.  
    //  write a C program to enter the salary and gender of the employees.  If the salary of the employee is
    //   less than 10000, then the employee gets an extra 2% bonus on salary.  Calculate the bonus that has to 
    //   be given to the employee and display the salary that the employee will get?


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        char gen = sc.next().charAt(0);

        double bonus =0;
        if(gen=='m'|| gen=='M'){
            bonus=salary*0.05;
        }
        else if(gen=='f'||gen=='F'){
            bonus=salary*0.10;
            
        }
        if(salary<10000){
            bonus=bonus+0.02;
        }

            double finalsal=salary+bonus;
            System.out.println(finalsal);
    }
}