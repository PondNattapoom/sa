
import java.io.IOException;
import java.util.concurrent.Flow;
import java.io.FileWriter;
public class NumberSubscriber extends StringSubscriber{
    private String path;
    public NumberSubscriber(String path){
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
                String str=item.replaceAll("[^0-9]","");
                writer.write(str);
                writer.close();
            }
            catch(IOException error){
                System.out.println("NumberSubscriber: " + error);
            }
        }
        else{
            System.out.println("NumberSubscriber: null item");
        }
    }

    @Override
    public void onError(Throwable throwable) {

    }
}