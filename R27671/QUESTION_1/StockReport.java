package R27671.QUESTION_1;

import java.util.List;

public final class StockReport {
	private String reportDate;
	private String remarks;

	public StockReport(String reportDate, String remarks) {
		setReportDate(reportDate);
		setRemarks(remarks);
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		if (reportDate == null || reportDate.trim().isEmpty())
			throw new IllegalArgumentException("reportDate cannot be null or empty");
		// simple YYYY-MM-DD check
		if (!reportDate.matches("\\d{4}-\\d{2}-\\d{2}"))
			throw new IllegalArgumentException("reportDate must be in YYYY-MM-DD format");
		this.reportDate = reportDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = (remarks == null) ? "" : remarks;
	}

	public void generateReport(Inventory inventory, List<Sale> sales) {
		System.out.println("----- Stock Report -----");
		System.out.println("Report Date: " + reportDate);
		System.out.println("Remarks: " + remarks);
		if (inventory != null) {
			System.out.println("Total Items: " + inventory.getTotalItems());
			System.out.println("Stock Value: " + inventory.getStockValue());
		} else {
			System.out.println("No inventory data provided.");
		}

		int totalSold = 0;
		if (sales != null && !sales.isEmpty()) {
			for (Sale s : sales) {
				totalSold += s.getSoldQuantity();
			}
		}
		System.out.println("Total Sold (all sales): " + totalSold);
		System.out.println("------------------------");
	}
}
