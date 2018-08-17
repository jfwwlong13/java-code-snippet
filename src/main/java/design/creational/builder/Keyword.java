package design.creational.builder;

public class Keyword {
    private final long adgroupId;
    private final long keywordId;
    private final String text;
    private final String finalUrl;
    private final double bid;

    private Keyword(final Builder builder) {
        this.adgroupId = builder.adgroupId;
        this.keywordId = builder.keywordId;
        this.text = builder.text;
        this.finalUrl = builder.finalUrl;
        this.bid = builder.bid;
    }

    public static Builder builder(final long adgroupId, final long keywordId) {
        return new Builder(adgroupId, keywordId);
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "adgroupId=" + adgroupId +
                ", keywordId=" + keywordId +
                ", text='" + text + '\'' +
                ", finalUrl='" + finalUrl + '\'' +
                ", bid=" + bid +
                '}';
    }

    public static class Builder {
        private final long adgroupId;
        private final long keywordId;
        private String text;
        private String finalUrl;
        private double bid;

        private Builder(final long adgroupId, final long keywordId) {
            this.adgroupId = adgroupId;
            this.keywordId = keywordId;
        }

        public Builder withText(final String text) {
            this.text = text;
            return this;
        }

        public Builder withFinalUrl(final String finalUrl) {
            this.finalUrl = finalUrl;
            return this;
        }

        public Builder withBid(final double bid) {
            this.bid = bid;
            return this;
        }

        public Keyword build() {
            return new Keyword(this);
        }
    }
}
