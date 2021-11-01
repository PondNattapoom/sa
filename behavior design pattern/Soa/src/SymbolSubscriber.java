
import java.io.IOException;
        import java.util.concurrent.Flow;
        import java.io.FileWriter;
public class SymbolSubscriber extends StringSubscriber{

    public SymbolSubscriber(){
        super("D:\\behavior design pattern\\Soa\\out\\symbol.txt");
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }


    @Override
    public void onNext(String item) {
        this.writeFile(item);
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public boolean checkType(String item) {
        return !item.matches("[a-zA-Z0-9.]*");
    }
}