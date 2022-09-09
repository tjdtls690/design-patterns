package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

public class Published implements State {
    private final Hotel hotel;
    
    public Published(Hotel hotel) {
        this.hotel = hotel;
    }
    
    @Override
    public void addClient(Client client) {
        hotel.getClients().add(client);
        if (hotel.getClients().size() > 1) {
            hotel.changeState(new Private(hotel));
        }
    }
    
    @Override
    public void addReview(Client client, String review) {
        hotel.getReviews().add(review);
    }
}
