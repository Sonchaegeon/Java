package generic;

public class Box<T> {
    private T t;

    public T getObject() {
        return t;
    }

    public void setObject(T t) {
        this.t = t;
    }
}
