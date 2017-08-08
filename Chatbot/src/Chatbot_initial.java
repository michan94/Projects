import java.util.*;

public class Chatbot_initial {

    static String[] responseBank = {
        "My name is Andrea, thanks for asking!",
        "Are you sure that is what you meant?",
        "Sorry...but you're not making sense...",
        "Same, buddy. I feel the same way.",
        "Great question...I dont have the best answer",
        "Really wanting a Big Mac right now"
    };

    static String removePunctuation(String input) {
        char[] output = new char[input.length()];
        int i = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
                output[i++] = ch;
            }
        }
        return new String(output, 0, i);
    }

    public static void main(String[] args) {
        boolean status = true;
        System.out.println("Hi Stranger! I'm Andrea. What's your name?");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hey, " + userName + "!");
        while (status) {
            Random randNumGenerator = new Random();
            System.out.println("What's your question? Say BYE to leave.");
            String questionInput = scan.nextLine();
            questionInput = removePunctuation(questionInput);
            int randResponseNum = randNumGenerator.nextInt(responseBank.length);
            String answer = responseBank[randResponseNum];
            if (questionInput.toUpperCase().equals("BYE")) {
                System.out.println("Please drop by again!");
                break;
            }
            if (questionInput.length() == 0) {
                System.out.println("Sorry, I don't understand your query");
            }
            else {
                System.out.println(answer);
            }
        }
    }
}
