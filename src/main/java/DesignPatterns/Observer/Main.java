package DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer alice = new NewsSubscriber("Alice");
        Observer bob = new NewsSubscriber("Bob");

        agency.subscribe(alice);
        agency.subscribe(bob);

        agency.setNews("Breaking: Java 22 released!");
        agency.setNews("Update: Observer Pattern is fun!");

        agency.unsubscribe(bob);

        agency.setNews("Final Update: Bob will not see this.");
    }
}
