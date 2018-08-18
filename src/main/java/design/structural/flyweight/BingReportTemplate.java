package design.structural.flyweight;

import com.google.common.collect.ImmutableList;

import java.util.Collection;

public class BingReportTemplate implements ReportTemplate {
    @Override
    public Collection<String> header() {
        return ImmutableList.of("id", "type");
    }
}
