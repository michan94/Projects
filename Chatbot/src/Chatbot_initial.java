import java.util.*;

public class Chatbot_initial {

    static String[] responseBank = {
        "Are you sure that is what you meant?",
        "Sorry...but you're not making sense...",
        "Same, buddy. I feel the same way.",
        "Great question...I dont have the best answer",
        "Really wanting a Big Mac right now"
    };

    public static void main(String[] args) {
        boolean status = true;
        System.out.println("Hi Stranger! I'm Andrea. What's your name?");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hey " + userName + "!");
        while (status) {
            Random randNumGenerator = new Random();
            System.out.println("What's your question? Say BYE to leave.");
            String questionInput = scan.nextLine();
            int randResponseNum = randNumGenerator.nextInt(responseBank.length);
            String answer = responseBank[randResponseNum];
            if (questionInput.toUpperCase().equals("BYE")) {
                System.out.println("Please drop by again!");
                break;
            }
            else {
                System.out.println(answer);
            }
        }
    }
}
