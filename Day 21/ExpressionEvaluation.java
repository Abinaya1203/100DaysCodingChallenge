import java.util.Stack;

public class ExpressionEvaluationStack {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If character is a number, push to stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');  // Convert char digit to int
            } 
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (c) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "23*54*+9-";   
        System.out.println("Postfix Evaluation: " + evaluatePostfix(postfix));
    }
}
