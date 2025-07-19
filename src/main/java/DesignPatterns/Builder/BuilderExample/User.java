package DesignPatterns.Builder.BuilderExample;

public class User {
    private String name;
    private int age;
    private String email;
    private String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }


    public static class Builder {
        private String name;
        private int age;
        private String email;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }


        public User build() {
            return new User(this);
        }
    }

        public void printUserDetails()

        {
            System.out.println("My name is + " + name);
            System.out.println("My age is " + age);
            System.out.println("My email is " + email);
            System.out.println("My address is " + address);

    }
}
