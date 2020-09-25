package diggingforfire;

public class CustomProgression extends Progression {
    protected long previous;

    public CustomProgression() {
        this(2, 200);
    }
    public CustomProgression(long first, long second) {
        super(first);
        previous = first + second;
    }

    @Override
    protected void advance() {
        long temp = previous;
        previous = current;
        current = Math.abs(current - temp);
    }
}
