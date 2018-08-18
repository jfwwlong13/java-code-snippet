package design.structural.flyweight;

import static design.structural.flyweight.ReportType.ADWORDS;
import static design.structural.flyweight.ReportType.BING;

public class App {
    public static void main(final String[] args) {
        final ReportTemplateFactory factory = new ReportTemplateFactory();
        final ReportTemplate reportTemplate1 = factory.getReportTemplate(ADWORDS);
        System.out.println(reportTemplate1.header());
        final ReportTemplate reportTemplate2 = factory.getReportTemplate(BING);
        System.out.println(reportTemplate2.header());
        final ReportTemplate reportTemplate3 = factory.getReportTemplate(ADWORDS);
        System.out.println(reportTemplate1 == reportTemplate3);
    }
}
