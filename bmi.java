import javax.swing.*;
import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("WELCOME TO BMI CALCULATOR");
            System.out.println("May i know your name please----");
            String name=sc.next();
            System.out.println("Ask me what do you want to show "+name);
            System.out.println("1) BMI value of you");
            System.out.println("2) Your BMI description");
            int what_to_show =sc.nextInt();
            switch(what_to_show){
                case 1:
                    bmi_solver();
                    break;
                case 2:
                    bmi_Display();
                default:
                    System.out.println("please enter correct one from below ");
                    System.out.println("");
            }
        }
    }
        public static void bmi_solver(){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your Weight in Kg's: ");
                int weight=sc.nextInt();
                System.out.println("Enter your Height in cm's:");
                int height=sc.nextInt();
                int BMI=weight*10000/(height*height);
                System.out.println("Your BMI is "+BMI+"(kg/m^2)");
        }
        public static void bmi_Display(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Weight in Kg's: ");
            int weight=sc.nextInt();
            System.out.println("Enter your Height in cm's:");
            int height=sc.nextInt();
            int BMI=weight*10000/(height*height);
            if(BMI<16.5){
                System.out.println( " You're severely underweighted person ");
            }
            else if(BMI<18.5){
                System.out.println("You're underweighted person ");
            }
            else if(BMI<25){
                System.out.println("You're normally weighted person ");
            }
            else if(BMI<30){
                System.out.println("You're overweighted person ");
            }
            else if(BMI<35){
                System.out.println("You're a obessive person & under class-1 obesity ");
            }
            else if(BMI<40){
                System.out.println("You're a obessive person & under class-2 obesity ");
            }
            else{
                System.out.println("You're under class-3 obesity and you are massive obessive person ");
            }
    }
}
