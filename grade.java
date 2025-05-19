import java.util.Scanner; 
/** 
 * Grade Calculator Application 
 * CS 310 Mini Project 
 * @author murad wasfi and daysam 
 */ 
public class GradeCalculator { 
     
    // Helper method to calculate average 
    private static double calculateAverage(int m, int s, int e) { 
        return (m + s + e) / 3.0; 
    } 
     
    // Makes sure the grade is within valid range 
   private static int getValidGrade(Scanner sc) {
    while (true) {
        if (sc.hasNextInt()) {
            int grade = sc.nextInt();
            if (grade >= 0 && grade <= 100) {
                return grade;
            } else {
                System.out.print("Please enter a number between 0-100: ");
            }
        } else {
            System.out.print("That's not a valid number! Try again: ");
            sc.next(); // Clear the invalid input
        }
    }
}
     
    // Convert numeric score to letter grade 
    private static String getLetterGrade(double score) { 
        if (score >= 90) return "A"; 
        if (score >= 80) return "B"; 
        if (score >= 70) return "C";  
        if (score >= 60) return "D"; 
        return "F"; 
         
    } 
     
     public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
         
        // Display welcome banner 
        System.out.println("=== Grade Calculator ==="); 
        System.out.println("Enter your scores below:"); 
         
        // Get subject grades from user 
        System.out.print("Math (0-100): "); 
        int mathScore = getValidGrade(input); 
         
        System.out.print("Science (0-100): "); 
        int scienceScore = getValidGrade(input); 
         
        System.out.print("English (0-100): "); 
        int englishScore = getValidGrade(input); 
         
        // Calculate the average grade 
        double avgScore = calculateAverage(mathScore, scienceScore, englishScore); 
        String letter = getLetterGrade(avgScore); 
         
        // Show results to user 
        System.out.println("\n=== Results ==="); 
        System.out.printf("Average: %.1f%%\n", avgScore); 
        System.out.println("Letter Grade: " + letter); 
         
        if (letter.equals("A") || letter.equals("B")) { 
            System.out.println("Great job!"); 
        } 
         
        System.out.println("\nThanks for using Grade Calculator!"); 
        input.close(); 
    } 
}
