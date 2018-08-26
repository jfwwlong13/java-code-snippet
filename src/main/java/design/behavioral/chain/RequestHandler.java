package design.behavioral.chain;

public abstract class RequestHandler {
    RequestHandler requestHandler;

    RequestHandler(final RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    void handleRequest(String request) {
        if (requestHandler != null) {
            requestHandler.handleRequest(request);
        }
    }
}
