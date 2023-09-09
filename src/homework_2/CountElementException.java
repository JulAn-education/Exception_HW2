package homework_2;

public class CountElementException extends Exception {

    private int count;

    public int getCount() {
        return count;
    }

    public CountElementException(String s, int count) {
        super(s);
        this.count = count;
    }
}
