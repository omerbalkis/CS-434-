package Model;

public class DisplayVisitor implements Visitor {

	@Override
	public void visit(Car car) {
		System.out.println("Calculating payment cost for Car " + "\n" + car.toString() + "\n");
	}

	@Override
	public void visit(Motorcycle motorcycle) {
		System.out.println("Calculating payment cost for Motorcycle " + "\n" + motorcycle.toString() + "\n");
	}

	@Override
	public void visit(LargeVehicle largeVehicle) {
		System.out.println("Calculating payment cost for Large Vehicle " + "\n" + largeVehicle.toString() + "\n");
	}

}
