/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.HashSet;
import java.util.Set;
import java.sql.*;


/**
 *
 * @author pahan
 */
public class IDGenarator {

    // Generate a new ID based on prefix and table name
    public static String generateID(String prefix, String tableName) throws SQLException {
        Set<String> existingIDs = getExistingIDsFromDB(tableName); // Fetch all existing IDs from the specified table
        String lastID = getLastID(prefix, existingIDs);            // Get the latest used ID

        String newID = incrementID(lastID, prefix); // Generate the next ID

        // Handle ID limit case (if it exceeds 999999)
        if (newID == null) {
            throw new RuntimeException("ID limit reached. Cannot generate a new ID.");
        }

        return newID;
    }

    // Retrieve all IDs from the specified table to ensure uniqueness
    private static Set<String> getExistingIDsFromDB(String tableName) throws SQLException {
        Set<String> existingIDs = new HashSet<>();

        try {
            String query = "SELECT id FROM " + tableName; // Query the specified table

            ResultSet rs = DB.search(query);

            while (rs.next()) {
                existingIDs.add(rs.getString("id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return existingIDs;
    }

    // Find the highest existing ID based on the prefix
    private static String getLastID(String prefix, Set<String> existingIDs) {
        String lastID = prefix + "000000"; // Default ID if no IDs exist

        for (String id : existingIDs) {
            if (id.startsWith(prefix) && id.compareTo(lastID) > 0) {
                lastID = id;
            }
        }
        return lastID;
    }

    // Increment the numeric part of the ID
    private static String incrementID(String currentID, String prefix) {
        // Extract the numeric part (e.g., "STU00123" -> "00123")
        String numericPart = currentID.substring(prefix.length());

        // Parse the numeric part and increment it
        int number = Integer.parseInt(numericPart) + 1;

        // If the number exceeds the limit, return null
        if (number > 999999) {
            return null;
        }

        // Format the new number with leading zeros (e.g., 123 -> "00123")
        String newNumericPart = String.format("%06d", number);

        // Return the new ID with the prefix
        return prefix + newNumericPart;
    }
}
