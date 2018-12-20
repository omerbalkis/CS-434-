package Model;

public interface Visitor {
	public void visit(Car car);

	public void visit(Motorcycle motorcycle);

	public void visit(LargeVehicle largeVehicle);

}
