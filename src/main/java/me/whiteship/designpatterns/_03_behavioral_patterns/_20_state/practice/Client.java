package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private final String name;
    private final Set<Hotel> hotels;
    
    public Client(String name) {
        this.name = name;
        this.hotels = new HashSet<>();
    }
    
    public void addPrivate(Hotel hotel) {
        this.hotels.add(hotel);
    }
    
    
    public boolean isAvailable(Hotel hotel) {
        return hotels.contains(hotel);
    }
    
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name +
                '}';
    }
}
