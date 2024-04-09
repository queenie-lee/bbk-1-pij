package week08;

public class Box<T> {
    private T data;

    public MyBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
