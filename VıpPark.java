import java.util.ArrayList;

public class VıpPark {
	
	//REQUIRED
	private Location location;
	private double occupancy;
	
	//OPTIONAL
	private Status status;
	private int capacity;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public VıpPark(Builder builder) {
		this.location = builder.location;
		this.capacity = builder.capacity;
		this.occupancy = builder.occupancy;
		this.status = builder.status;
		this.vehicles = builder.vehicles;
	}
	
	
	public Location getAddress() {
		return this.location;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public double getOccupancy() {
		return this.occupancy;
	}
	
	public Status getStatus() {
		return this.status;
	}
	
	public ArrayList<Vehicle> getVehicles() {
		return this.vehicles;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Location : ").append(location).
		append("\nOccupancy : ").append(occupancy);
		
		if(status != null) {
			sb.append("\nColor : ").append(status);
		}
		
		if(capacity != 0) {
			sb.append("\nCapacity : ").append(capacity);
		}
		
		if(vehicles != null) {
			sb.append("\nVehicles : ").append(vehicles);
		}
		
		return sb.toString();
		
	}
	
	public static class Builder {
		private Location location;
		private double occupancy;
		private Status status;
		private int capacity;
		private ArrayList<Vehicle> vehicles;
		
		public Builder(Location location, double occupancy) {
			if(location == null || occupancy < 0) {
				throw new IllegalArgumentException("Invalid information detected");
			}
			this.location = location;
			this.occupancy = occupancy;
		}
		
		public Builder withCapacity(int capacity) {
			this.capacity = capacity;
			return this;
		}
		
		public Builder withStatus(Status status) {
			this.status = status;
			return this;
		}
		
		public Builder withVehicle(Vehicle vehicle) {
			if(!vehicles.contains(vehicle))
				vehicles.add(vehicle);
			return this;
		}
		
		public Builder removeVehicle(Vehicle vehicle) {
			vehicles.remove(vehicle);
			return this;
		}
		
		public VıpPark build() {
			return new VıpPark(this);
	
		}
		
	}

}
