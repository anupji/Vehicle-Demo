package com.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            OwnerDAO ownerDAO = new OwnerDAO();
            VehicleDAO vehicleDAO = new VehicleDAO();

            // 1. Add Owner
            Owner owner = new Owner("Alice Smith", "alice@example.com");
            ownerDAO.addOwner(owner);
            System.out.println("Owner added.");

            // 2. Add Vehicle
            Vehicle vehicle = new Vehicle("Toyota Camry", "KA-01-AB-1234");
            vehicleDAO.addVehicle(vehicle);
            System.out.println("Vehicle added.");

            // Assume you know the IDs (use SELECT in real apps)
            int ownerId = 1;
            int vehicleId = 1;

            // 3. Assign Owner
            vehicleDAO.assignOwner(vehicleId, ownerId);
            System.out.println("Vehicle assigned to owner.");

            // 4. Unassign Owner
            vehicleDAO.unassignOwner(vehicleId);
            System.out.println("Owner unassigned from vehicle.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
