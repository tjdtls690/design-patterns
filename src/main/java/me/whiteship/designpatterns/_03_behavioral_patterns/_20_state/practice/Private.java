package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

public class Private implements State {
    private final Hotel hotel;
    
    public Private(Hotel hotel) {
        this.hotel = hotel;
    }
    
    @Override
    public void addClient(Client client) {
        if (client.isAvailable(hotel)) {
            hotel.getClients().add(client);
            return;
        }
        
        throw new UnsupportedOperationException("호텔을 이용하실 수 없습니다.");
    }
    
    @Override
    public void addReview(Client client, String review) {
        if (hotel.getClients().contains(client)) {
            hotel.getReviews().add(review);
            return;
        }
        
        throw new UnsupportedOperationException("리뷰를 하실 수 없습니다.");
    }
}
