package objectOrientedExercises;

public class InvoiceApplication {

	private String partNumber;
	private String partDescription;
	private int quantityOfItem;
	private double pricePerItem;

	public InvoiceApplication(String partNumber, String partDescription, int quantityOfItem, double pricePerItem) {

		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantityOfItem = quantityOfItem;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantityOfItem() {
		return quantityOfItem;
	}

	public void setQuantityOfItem(int quantityOfItem) {
		this.quantityOfItem = quantityOfItem;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	public double getInvoiceAmount() {
		double invoiceAmount = 0;
		if (quantityOfItem < 0) {
			quantityOfItem = 0;
		}

		if (pricePerItem < 0) {
			pricePerItem = 0;
		} else {
			invoiceAmount = quantityOfItem * pricePerItem;
		}
		return invoiceAmount;
	}

}
