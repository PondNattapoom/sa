import java.io.IOException;
import java.util.concurrent.Flow;
import java.io.FileWriter;
public class AlphabetSubscriber extends StringSubscriber{
    private String path;
    public AlphabetSubscriber(String path){
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
                String str=item.replaceAll("[^a-zA-Z]","");
                writer.write(str);
                writer.close();
            }
            catch(IOException error){
                System.out.println("AlphabetSubscriber: " + error);
            }
        }
        else{
            System.out.println("AlphabetSubscriber: null item");
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }
}
