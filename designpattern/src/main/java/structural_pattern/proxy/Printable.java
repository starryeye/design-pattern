package structural_pattern.proxy;

public interface Printable {

    public abstract void setMessage(String msg);
    public abstract String getMessage();
    public abstract void createMessage(String msg);
    
}
