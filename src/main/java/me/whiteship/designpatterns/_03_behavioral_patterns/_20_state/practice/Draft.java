package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

public class Draft implements State {
    private final Hotel hotel;
    
    public Draft(Hotel hotel) {
        this.hotel = hotel;
    }
    
    @Override
    public void addClient(Client client) {
        hotel.getClients().add(client);
        if (hotel.getClients().size() > 0) {
            hotel.changeState(new Published(hotel));
        }
    }
    
    @Override
    public void addReview(Client client, String review) {
        throw new UnsupportedOperationException("해당 호텔은 고객이 0명이기 때문에 리뷰를 하실 수 없습니다.");
    }
}
