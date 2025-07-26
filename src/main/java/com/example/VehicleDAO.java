package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleDAO {

    public void addVehicle(Vehicle vehicle) throws SQLException {
        String sql = "INSERT INTO Vehicle (model, registration_no) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, vehicle.getModel());
            stmt.setString(2, vehicle.getRegistrationNo());
            stmt.executeUpdate();
        }
    }

    public void assignOwner(int vehicleId, int ownerId) throws SQLException {
        String sql = "UPDATE Vehicle SET owner_id = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, ownerId);
            stmt.setInt(2, vehicleId);
            stmt.executeUpdate();
        }
    }

    public void unassignOwner(int vehicleId) throws SQLException {
        String sql = "UPDATE Vehicle SET owner_id = NULL WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, vehicleId);
            stmt.executeUpdate();
        }
    }
}
