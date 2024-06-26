package chapter_19.lesson_243.entities;

public class Client {
    private String name;
    private String email;

    //***********************************************************************
    // CONSTRUCTORS
    //***********************************************************************
    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //***********************************************************************
    // GETTERS AND SETTERS
    //***********************************************************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //***********************************************************************
    // HASHCODE EQUALS
    //***********************************************************************
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!name.equals(client.name)) return false;
        return email.equals(client.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }
}
