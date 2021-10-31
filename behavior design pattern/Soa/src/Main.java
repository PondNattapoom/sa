import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber("D:\\Soa\\out\\alphabet.txt");
        StringSubscriber numberSubscriber = new NumberSubscriber("D:\\Soa\\out\\number.txt");
        StringSubscriber symbolSubscriber = new SymbolSubscriber("D:\\Soa\\out\\symbol.txt");

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);
        String exit = "";
        do{

                System.out.print("Enter a string: ");
                String str = sc.nextLine();
                publisher.publish(str);
                exit="continue";
                if(str==""){
                    exit="";
                }
        }
        while(exit!="");

    }
}
