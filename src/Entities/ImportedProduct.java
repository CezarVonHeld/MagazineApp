package Entities;

public class ImportedProduct extends Product {
	private Double customsFee;

	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public double FinalPrice()
	{
		return getPrice()+customsFee;
	}

	@Override
	public String toString() {
		return getName() + ", $ " + String.format("%.2f", FinalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) +")";
	}	
}
