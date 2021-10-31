
import java.io.IOException;
        import java.util.concurrent.Flow;
        import java.io.FileWriter;
public class SymbolSubscriber extends StringSubscriber{
    private String path;
    public SymbolSubscriber(String path){
        this.path = path;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }


    @Override
    public void onNext(String item) {
        if(item!=null){
            try{
                FileWriter writer = new FileWriter(this.path,true);
                String str=item.replaceAll("[a-zA-Z]|[0-9]|[\\s]","");
                writer.write(str);
                writer.close();
            }
            catch(IOException error){
                System.out.println("SymbolSubscriber: " + error);
            }
        }
        else{
            System.out.println("SymbolSubscriber: null item");
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }
}