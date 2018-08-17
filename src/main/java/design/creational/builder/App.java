package design.creational.builder;

public class App {
    public static void main(final String[] args) {
        final Keyword keyword = Keyword.builder(1L, 2L)
                .withBid(3.3)
                .withFinalUrl("http://www.indeed.com")
                .withText("keyword text")
                .build();
        System.out.println(keyword);
    }
}
