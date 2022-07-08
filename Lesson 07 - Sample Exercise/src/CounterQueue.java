import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;

public class CounterQueue extends AbstractQueue<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(Integer integer) {
        return false;
    }

    @Override
    public Integer poll() {
        return null;
    }

    @Override
    public Integer peek() {
        return null;
    }
}
