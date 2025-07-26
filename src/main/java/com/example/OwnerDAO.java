package com.example;

import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OwnerDAO {
    public void addOwner(Owner owner) throws SQLException {
        String sql = "INSERT INTO Owner (name, email) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, owner.getName());
            stmt.setString(2, owner.getEmail());
            stmt.executeUpdate();
        }
    }
}
