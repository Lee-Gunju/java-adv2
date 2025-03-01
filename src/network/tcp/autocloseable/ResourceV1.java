package network.tcp.autocloseable;

public class ResourceV1 {

    private String name;

    public ResourceV1(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println("Calling " + name);
    }

    public void callEx() throws CallException {
        System.out.println("Calling ex " + name);
        throw new CallException(name + " ex");
    }

    public void close() {
        System.out.println(name + " closed");
    }

    public void closeEx() throws CloseException {
        System.out.println(name + " clse ex");
        throw new CloseException(name + " ex");
    }
}
