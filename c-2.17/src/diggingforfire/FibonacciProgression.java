package diggingforfire;

public class FibonacciProgression extends Progression {
    protected long previous;

    public FibonacciProgression() {
        this(0, 1);
    }

    public FibonacciProgression(long first, long second) {
        super(first);
        previous = second - first;
    }

    @Override
    protected void advance() {

        current += previous;
        previous = current - previous;
    }
}
