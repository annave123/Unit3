import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

                System.out.println("Hint when choosing the operator, make sure you spell it out");


        System.out.println("List the operation you would like to use");
        Scanner Input = new Scanner(System.in);
        String response = Input.next().toLowerCase();

        if (response.equals("subtract")) {
                System.out.println("Enter the first number to subtract");
                double first = Input.nextDouble();


                System.out.println("Enter the second number to subtract");
                double second = Input.nextDouble();
                double end = Math.sqrt(first - second);
                System.out.println("The answer is" + end);
                System.out.println("Is the answer right? Y or N");
                String finalResponse = Input.next();
                if (finalResponse.equalsIgnoreCase("Y"))

                {
                    System.out.println("Of course it's correct");

                } else {
                System.out.println("What did I do wrong");


                String annswer = Input.next().toLowerCase();
                if (annswer.equalsIgnoreCase("sqrt"))
                    System.out.println("Ya, you got me " + annswer);
                else {
                    System.out.println("Well, you got 1/2 ");
                }
            }
        } else if (response.equals("add")) {
            System.out.println("Enter the first number to add");


            double first = Input.nextDouble();
            System.out.println("Enter the second number to add");


            double second = Input.nextDouble();


            double answer = Math.sqrt(first - second);
            System.out.println("The answer is: " + answer);


            System.out.println("Is the answer right? Y or N");
            String Ending = Input.next();


            if (Ending.equalsIgnoreCase("Y")) {
                System.out.println("Of Course");
            } else {
                System.out.println("What did I do wrong");
                String end = Input.next();
                if (end.equalsIgnoreCase("sqrt"))
                    System.out.println("Ya, you got me " + end);
                else {
                    System.out.println("Well, you got 1/2");
                }
            }
        } else if (response.equals("divide")) {
            System.out.println("Enter the first number to divide");
                 double first = Input.nextDouble();
            System.out.println("Enter the second number to divide");
            double second = Input.nextDouble();
            double answer = Math.sqrt(first / second);


            System.out.println("The answer is " + answer);
            System.out.println("Is the answer right Y or N");
            String finalResponse = Input.next();
            if (finalResponse.equalsIgnoreCase("Y")) {
                System.out.println("Of Course");
            } else {
                System.out.println("What did I do wrong");
                String end = Input.next();
                if (end.equalsIgnoreCase("sqrt"))
                    System.out.println("Ya, you got me " + end);
                else {
                    System.out.println("Well, you got 1/2");
                }
            }
        } else if (response.equals("multiply")) {
            System.out.println("Enter the first number to multiply");
            double first = Input.nextDouble();
            System.out.println("Enter the second number to multiply");


            double second = Input.nextDouble();
            double end = Math.sqrt(first / second);


            System.out.println("Your answer is " + end);
            System.out.println("Is the answer right Y or N");
            String finalResponse = Input.next();
            if (finalResponse.equalsIgnoreCase("Y")) {
                System.out.println("Of Course");
            } else {
                System.out.println("What did I do wrong");
                String answer = Input.next();
                if (answer.equalsIgnoreCase("sqrt"))
                    System.out.println("Ya, you got me" + answer);
                else {
                    System.out.println("Well, you got 1/2");

                    System.out.println("Thanks for using the accurate calculator");
                }

            }
        }
    }
}

