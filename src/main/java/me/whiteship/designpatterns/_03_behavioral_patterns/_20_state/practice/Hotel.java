package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

import java.util.HashSet;
import java.util.Set;

public class Hotel {
    private State state;
    private final Set<Client> clients;
    private final Set<String> reviews;
    
    public Hotel() {
        this.state = new Draft(this);
        this.clients = new HashSet<>();
        this.reviews = new HashSet<>();
    }
    
    public void addClient(Client client) {
        this.state.addClient(client);
    }
    
    public void addReview(Client client, String review) {
        this.state.addReview(client, review);
    }
    
    public void changeState(State state) {
        this.state = state;
    }
    
    public Set<Client> getClients() {
        return clients;
    }
    
    public Set<String> getReviews() {
        return reviews;
    }
    
    public State getState() {
        return state;
    }
}
