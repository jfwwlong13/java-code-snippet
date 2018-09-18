package jdk.refactor;

public class Keyword {
    private final long campaignId;
    private final long adgroupId;
    private final long keywordId;
    private final String campaignName;
    private final String adgroupName;
    private final String keywordName;

    public Keyword(long accountId, long campaignId, long adgroupId, long keywordId, String accountName, String campaignName, String adgroupName, String keywordName) {
        this.campaignId = campaignId;
        this.adgroupId = adgroupId;
        this.keywordId = keywordId;
        this.campaignName = campaignName;
        this.adgroupName = adgroupName;
        this.keywordName = keywordName;
    }

    public long getCampaignId() {
        return campaignId;
    }

    public long getAdgroupId() {
        return adgroupId;
    }

    public long getKeywordId() {
        return keywordId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getAdgroupName() {
        return adgroupName;
    }

    public String getKeywordName() {
        return keywordName;
    }
}
