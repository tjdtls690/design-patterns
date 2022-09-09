package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Client jun = new Client("jun");
        Client young = new Client("young");
        Client sin = new Client("sin");
        
        hotel.addClient(jun);
        hotel.addReview(jun, "hello");
        
        hotel.addClient(young);
        hotel.addReview(young, "nice!!");

        sin.addPrivate(hotel);
        hotel.addClient(sin);
        hotel.addReview(sin, "hi~");
        
    
        System.out.println(hotel.getClients());
        System.out.println(hotel.getReviews());
        System.out.println(hotel.getState().getClass().getSimpleName());
    }
}
