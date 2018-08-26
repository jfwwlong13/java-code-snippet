package design.behavioral.chain;

public class Commander extends RequestHandler {
    Commander(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    void handleRequest(String request) {
        if (request.equals("command")) {
            System.out.println("Command handled by commander");
        } else {
            super.handleRequest(request);
        }
    }
}
