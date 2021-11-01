import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Flow;
import java.util.LinkedHashSet;
import java.util.Set;
public class StringPublisher implements Flow.Publisher<String>{
    Set<Flow.Subscriber<? super String>> subscribers = new LinkedHashSet<>();

    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber) {
        subscribers.add(subscriber);
    }
    public void publish(String item) {

        for (Flow.Subscriber subscriber: subscribers)
            if (((StringSubscriber) subscriber).checkType(item))
                subscriber.onNext(item);

    }

    }


