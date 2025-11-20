package R27671.QUESTION_4;

import java.util.List;

public final class ProcurementReport {
    private String reportDate;
    private String summary;

    public ProcurementReport(String reportDate, String summary) {
        setReportDate(reportDate);
        setSummary(summary);
    }

    public String getReportDate() { return reportDate; }
    public void setReportDate(String reportDate) {
        if (reportDate == null || reportDate.trim().isEmpty()) throw new IllegalArgumentException("reportDate cannot be null");
        this.reportDate = reportDate;
    }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = (summary == null) ? "" : summary; }

    public double calculateTotal(List<Invoice> invoices) {
        if (invoices == null) return 0.0;
        double total = 0.0;
        for (Invoice inv : invoices) total += inv.getInvoiceAmount();
        return total;
    }
}
