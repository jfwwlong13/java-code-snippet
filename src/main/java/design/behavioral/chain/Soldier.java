package design.behavioral.chain;

public class Soldier extends RequestHandler {
    Soldier(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    void handleRequest(String request) {
        if (request.equals("soldier")) {
            System.out.println("Request handled by soldier");
        } else {
            super.handleRequest(request);
        }
    }
}
