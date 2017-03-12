package mathrunner;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author vineet
 */
public class TestingDegree {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while(true){
            str=sc.nextLine();
            if(!str.equalsIgnoreCase("stop"))
            testquad(str);
            else break;
        }
    }

    private static void testquad(String str) {
        final Pattern quadeqn = Pattern.compile("([+-]?\\d+)[Xx]2\\s*([+-]?\\d+)[Xx]\\s*([+-]?\\d+)\\s*=\\s*0");
        final Matcher matcher = quadeqn.matcher(str);

        if (matcher.matches()){
            final int a = Integer.parseInt(matcher.group(1));
            final int b = Integer.parseInt(matcher.group(2));
            final int c = Integer.parseInt(matcher.group(3)); 
            double x1,x2,temp;
            temp = Math.sqrt((b*b)-(4*a*c));
            x1 = (-b + temp)/2*a;
            x2 = (-b - temp)/2*a;
            System.out.println("Quadratic Euation with solution x1= " + x1 +" and x2="+ x2 + " .");
        }
        else System.out.println("Not Quadratic Equation.");
    }
}

