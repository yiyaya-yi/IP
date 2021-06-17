package IP;

public interface TVIterator {

    public void setChannel(int i);

    public Object currentChannei();

    public void next();

    public void previous();

    public boolean isLast();

    public boolean isFirst();

}
