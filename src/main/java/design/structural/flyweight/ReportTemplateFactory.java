package design.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class ReportTemplateFactory {
    private final Map<ReportType, ReportTemplate> map = new EnumMap<>(ReportType.class);

    ReportTemplate getReportTemplate(final ReportType reportType) {
        ReportTemplate reportTemplate = map.get(reportType);
        if (reportTemplate != null) {
            return reportTemplate;
        }

        switch (reportType) {
            case ADWORDS:
                map.put(ReportType.ADWORDS, new AdwordsReportTemplate());
                break;
            case BING:
                map.put(ReportType.BING, new BingReportTemplate());
                break;
        }

        return map.get(reportType);
    }
}
