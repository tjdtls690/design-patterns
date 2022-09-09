package me.whiteship.designpatterns._03_behavioral_patterns._20_state.practice;

public interface State {
    void addClient(Client client);
    void addReview(Client client, String review);
}
