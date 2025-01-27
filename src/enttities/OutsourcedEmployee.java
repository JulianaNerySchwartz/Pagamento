package enttities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;

	//Constructors
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	//Getters and Setters
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return (hours * valuePerHour) + (1.1 * additionalCharge);
	}
	
}
