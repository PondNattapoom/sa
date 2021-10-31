import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String>{

    public abstract void onSubscribe(Flow.Subscription subscription);
    @Override
    public abstract void onNext(String item);

    @Override
    public abstract void onError(Throwable throwable);

    @Override
    public void onComplete(){
        System.out.println("Completed.");
    }

}
