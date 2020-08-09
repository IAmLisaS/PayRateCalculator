//Lisa Sinn
//Intro to Java
//CSCI 1146-241
//Pay.java
//Unit 5, Exercise #6

import java.util.*;
import javax.swing.JOptionPane;

class Pay
{
public static void main(String[] args)
{

int choice;
choice = 0;
double retirement=0;
double insurance;
double totalPay;
insurance = 0;
double rate;
rate = 0;
double hoursWorked;
double regularPay;
double overtimePay;
double netPay;
int skillLevel;
final int FULL_WEEK = 40;
final double OT_RATE = 1.5;
Scanner inputDevice = new Scanner(System.in);

do
{System.out.print("What is your skill level? Enter 1, 2, or 3: ");
skillLevel = inputDevice.nextInt();

if(skillLevel == 1)
   rate = 17.00;
else if(skillLevel == 2)
   rate = 20.00;
else if(skillLevel == 3)
   rate = 22.00;
else
   System.out.println("Invalid skill level.");
}while(skillLevel<1||skillLevel>3);
System.out.print("How many hours did you work this week? ");
hoursWorked = inputDevice.nextDouble();
if(hoursWorked > FULL_WEEK)
{
regularPay = FULL_WEEK * rate;
overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
}
else
{

regularPay = hoursWorked * rate;
overtimePay = 0.0;
}


int n = JOptionPane.showConfirmDialog(null,"You want medical insurance?",
null, JOptionPane.YES_NO_OPTION);
//use value of n for other loops as activator
if(n==JOptionPane.YES_OPTION){insurance+=32.5;

}

int m = JOptionPane.showConfirmDialog(null,"You want dental insurance?",
null, JOptionPane.YES_NO_OPTION);

if(m==JOptionPane.YES_OPTION){insurance+=20;

}


int b = JOptionPane.showConfirmDialog(null,"You want long term disability insurance?",
null, JOptionPane.YES_NO_OPTION);

if(b==JOptionPane.YES_OPTION){insurance+=10;
}


if(skillLevel == 3)
{System.out.println("Would you like to participate in the retirement plan? Enter 1 for yes or 0 for no: ");
choice = inputDevice.nextInt();
if(choice == 1)
retirement = 0.03;
else
retirement = 0;
}

totalPay = regularPay + overtimePay;
retirement*=retirement*totalPay;

     
netPay = totalPay - insurance - retirement;
System.out.println("Regular pay is: " +
regularPay + "\nOvertime pay is: " + overtimePay + "\nHours worked: " + hoursWorked +
"\nYour hourly rate is: " + rate + "\nTotal gross pay is: " + (regularPay + overtimePay) +
"\nYour total deductions are: \nInsurance: " + insurance + "\nRetirement: "+retirement);
if(retirement+insurance>totalPay)
      System.out.println("Your deductions are more than your pay: ");
else
      System.out.println("Your net pay is: " + netPay);
}

}