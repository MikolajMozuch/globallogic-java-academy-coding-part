public class Main {

    public static void main(String[] args) {
        LetterCountingService letterCountingService = new LetterCountingService();
    if (args.length !=1){
        throw new IllegalArgumentException("Wrong number of arguments, expected 1");
    }
        letterCountingService.letterCountingConsolePrint(args[0]);
    }
}
