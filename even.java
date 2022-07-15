//write a java program which accept number from user and return the count of even Digit.

import java.lang.*; 
import java.util.*;

class  Even
{
    public static void main(String arg[])
    {
        int iret=0;
        Scanner sobj=new Scanner(System.in);//user Accept input

        System.out.println("Enter the number");
        int ino=sobj.nextInt();

        Digit dobj=new Digit();   //object creation in java
        iret=dobj.CountEvenDigit(ino);

        System.out.println("Count of Even Digit is:"+iret);
        
    }
}


class Digit
{
    public int CountEvenDigit(int ino1)
    {
        int icnt=0;

        while(ino1!=0)
        {
            if((ino1%2)==0)
            {
                icnt++;
            }
           ino1=ino1/10; 
        }
        return icnt;

    }
}

