package design.behavioral.chain;

public class App {
    public static void main(final String[] args) {
        final RequestHandler requestHandler = new Commander(new Officer(new Soldier(null)));
        requestHandler.handleRequest("command");
        requestHandler.handleRequest("office");
        requestHandler.handleRequest("soldier");
    }
}
