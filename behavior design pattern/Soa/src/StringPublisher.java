import java.util.concurrent.Flow;
import java.util.LinkedHashSet;
import java.util.Set;
public class StringPublisher implements Flow.Publisher<String>{
    private Set<Flow.Subscriber> subscribers;

    StringPublisher() {
        subscribers = new LinkedHashSet<>();
    }
    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void publish(String item) {
        for (Flow.Subscriber subscriber: subscribers)
                subscriber.onNext(item);
    }

}
