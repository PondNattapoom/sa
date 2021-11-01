import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String>{
    private Flow.Subscription subscription;
    protected String path;
    public StringSubscriber(String type) {
        this.path=type;
    }

    public void onSubscribe(Flow.Subscription subscription){
    };
    @Override
    public abstract void onNext(String item);

    @Override
    public abstract void onError(Throwable throwable);

    @Override
    public void onComplete(){
        System.out.println("Completed.");
    }
    public abstract  boolean checkType(String item);
public void writeFile(String item){
    try {
        FileWriter myWriter = new FileWriter(this.path, true);
        PrintWriter myPrinter = new PrintWriter(myWriter);
        myPrinter.print(item);
        myPrinter.close();
        myWriter.close();
    } catch (IOException error) {
        System.out.println("error was occurred");
    }
}
}
