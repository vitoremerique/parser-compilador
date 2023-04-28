package parser;

public class Main {
    public static void main(String[] args) {
       IParser parser = new Parser();

       String[] testStrings = {
            "a+b*c-d",
            "(a+b)*c/d",
            "-a^2",
            "3*4+5/6",
            "b^-2",
            "3=2"
       };

       for(String testeString : testStrings) {
            if(parser.parse(testeString)) 
                System.out.println("String "+ testeString +" is valid");
       }
    }
}
