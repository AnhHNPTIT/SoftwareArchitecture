package InterpreterPattern;
public class AnhHN{
    private static int interpret(String input){
        Expression exp = null;
        if(input.contains("cộng")){
            exp = new AddExpression(input);
        }
        else if(input.contains("trừ")){
            exp = new SubExpression(input);
        }
        else{
            throw new UnsupportedOperationException();
        }
        return exp.interpret(new InterpreterEngineContext());
    }
    
    public static void main (String[] args) {
       System.out.println("27 cộng 12 = " + interpret("27 cộng 12"));
       System.out.println("5 trừ 7 = " + interpret("5 trừ 7"));
    }
}
