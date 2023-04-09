import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SurveyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the survey program!");
        System.out.println("Please answer the following questions:");

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your favorite color?");
        scanner.nextLine(); // consume the newline character
        String color = scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("What is your occupation?");
        String occup = scanner.nextLine();

        System.out.println("How frequently do you use our product/services?");
        String fre = scanner.nextLine();

        System.out.println("How satisfied are you with our product/services?");
        String sat = scanner.nextLine();

        System.out.println("How likely are you to recommend our product/services to a friend or colleague?");
        String rec = scanner.nextLine();

        System.out.println("What features do you like the most about our product/services?");
        String fet = scanner.nextLine();

        System.out.println("What is your Highest level of education?");
        String edu = scanner.nextLine();        

        System.out.println("Thank you for taking the survey!");

        try {
            FileWriter writer = new FileWriter("survey_responses.txt", true);
            writer.write(name + "," + age + "," + color + "," + food + "," + occup + "," + edu + "," + fre + "," + sat + "," + rec + "," + "," + fet + "," + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the survey responses.");
            e.printStackTrace();
        }
    }
}
