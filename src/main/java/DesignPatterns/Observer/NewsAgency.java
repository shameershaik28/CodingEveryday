package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
    private String latestNews;

    public void setNews(String news){
        this.latestNews = news;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer o) {
         subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }


    @Override
    public void notifyObservers()
    {
      for(Observer o : subscribers)
        {
            o.update(latestNews);
        }
    }
}
