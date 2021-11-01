
import java.util.concurrent.Flow;
public class StringSubscription implements Flow.Subscription{
    public Flow.Subscriber subscriber;
    StringSubscription(Flow.Subscriber<? super String> subscriber){
        this.subscriber = subscriber;
    }

    @Override
    public void request(long n) {

    }
    @Override
    public void cancel() {

    }
    public void publish(String str) {
            subscriber.onNext(str);
    }
}
