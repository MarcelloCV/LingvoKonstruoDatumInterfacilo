import java.util.List;
import java.util.ArrayList;
public class Tokeniser {
    public static void main(String[] args) {
        // Example input data
        String input = "1 + 2 * 3";

        // Tokenise the input expression
        List<Token> tokens = tokeniseExpression(input);

        // Print the tokens
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
    // Example method for tokenising an arithmetic expression
    private static List<Token> tokeniseExpression(String input) {
        // For demonstration purposes, let's assume we split the input into tokens
        // based on spaces and operators (+, -, *, /)

        // Split input into tokens (replace with your actual logic)
        String[] tokenStrings = input.split("\\s+");

        // Create Token objects (replace with your actual logic)
        List<Token> tokens = new ArrayList<>();
        for (String tokenString : tokenStrings) {
            tokens.add(new Token(tokenString));
        }
        return tokens;
    }

    // Example Token class
    private static class Token {
        private String value;

        public Token(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }


}