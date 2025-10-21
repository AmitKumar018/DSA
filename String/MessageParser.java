package String;
import java.util.*;

public class MessageParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        TreeMap<Long, Character> messages = new TreeMap<>(); // Maintains sorted order of indices

        for (int i = 0; i < N; i++) {
            long index = scanner.nextLong();
            char ch = scanner.next().charAt(0);
            messages.put(index, ch); // Store character at given index
        }

        scanner.close(); // Close scanner after input is taken

        // Now process the messages to find valid sequences
        StringBuilder message = new StringBuilder();
        boolean inside = false; // Indicates if we are inside a valid message sequence
        List<String> outputMessages = new ArrayList<>();

        for (Map.Entry<Long, Character> entry : messages.entrySet()) {
            char c = entry.getValue();

            if (c == '*') {
                if (inside && message.length() > 0) {
                    outputMessages.add(message.toString()); // Store valid message
                }
                message.setLength(0); // Reset message
                inside = true; // Start a new message sequence
            } else if (inside) {
                message.append(c);
            }
        }

        // Add the last message if it was not followed by '*'
        if (inside && message.length() > 0) {
            outputMessages.add(message.toString());
        }

        // Print all valid messages
        for (String msg : outputMessages) {
            System.out.println(msg);
        }
    }
}
