package Boat.Model;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Account {
    @NotEmpty
    @Size(min = 6,max = 16 , message = "Mew mew mew")
    private String username;
    @NotEmpty(message = "mew mew mew mew")
    @Size(min = 8,max = 32,message = "mew mew")
    private String password;
    @NotEmpty(message = "mew mew mew mew mew")
    private String method;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
