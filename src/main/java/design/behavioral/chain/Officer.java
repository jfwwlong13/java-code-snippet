package design.behavioral.chain;

public class Officer extends RequestHandler {
    Officer(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    void handleRequest(String request) {
        if (request.equals("office")) {
            System.out.println("Request handled by officer");
        } else {
            super.handleRequest(request);
        }
    }
}
