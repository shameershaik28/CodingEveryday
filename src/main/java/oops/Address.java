package oops;

public class Address {

    String city;
    String country;
    int zip;


    public Address(String city, String country, int zip) {
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public void print()
    {
        System.out.println(city + " " + country + " " + zip);
    }
}

