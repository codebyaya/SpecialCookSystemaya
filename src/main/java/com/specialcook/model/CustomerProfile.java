package com.specialcook.model;

import java.util.List;

public class customer {
    private String name;
    private List<String> allergies;
    private List<String> dietaryPreferences;
    private List<Order> orderHistory;

    public customer() {}

    public customer(String name, List<String> allergies, List<String> dietaryPreferences, List<Order> orderHistory) {
        this.name = name;
        this.allergies = allergies;
        this.dietaryPreferences = dietaryPreferences;
        this.orderHistory = orderHistory;
    }

    public customer(String testUser, String preference, String s) {
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<String> getDietaryPreferences() {
        return dietaryPreferences;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    public void setDietaryPreferences(List<String> dietaryPreferences) {
        this.dietaryPreferences = dietaryPreferences;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}