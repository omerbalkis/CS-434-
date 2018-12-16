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
		append("\nOccupancy : ").append(occupancy).append("\nAvaible Space : ").append(capacity-occupancy);
		
		if(status != null) {
			sb.append("\nColor : ").append(status);
		}
		if(capacity != 0) {
			sb.append("\nCapacity : ").append(capacity);
		}
		if(vehicles != null) {
			sb.append("\nVehicles : ").append(carViewer(vehicles));
		}
		return sb.toString();
	}

	public String carViewer(ArrayList<Vehicle> v){
		String list = "";
		for (int i = 0; i < v.size(); i++){
			list += (v.get(i).getModel().toUpperCase() + ",\n");
		}
		return list;
	}

	public static class Builder {
		private Vehicle vehicle;
		private Location location;
		private double occupancy;
		private Status status;
		private int capacity;
		private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		public Builder(Location location, int capacity) {
			if(location == null) {
				throw new IllegalArgumentException("Invalid information detected");
			}
			occupancy = 0;
			this.location = location;
			this.capacity = capacity;
		}
		
		public Builder updateCapacity(int capacity) {
			this.capacity = capacity;
			return this;
		}
		
		public Builder withStatus(Status status) {
			this.status = status;
			return this;
		}
		
		public Builder updateOccupancy() {
			this.occupancy++;
			return this;
		}
		
		public Builder withVehicle(Vehicle vehicle) {
			//if(this.occupancy <= this.capacity && !this.vehicles.contains(vehicle))
			this.vehicles.add(vehicle);
			updateOccupancy();
			return this;
		}
		
		public Builder removeVehicle(Vehicle vehicle) {
			if (this.vehicles.contains(vehicle)) {
				vehicles.remove(vehicle);
				this.occupancy--;
			}
			else {
				throw new IllegalArgumentException("There is no such a vehicle in the parking space.");
			}
			return this;
		}
		
		public VıpPark build() {
			return new VıpPark(this);
		}
	}
}
