package mimarket.entity;

public class UserTO {
    
    private int userId;
    private String username;
    private String password;
    private String type;

    public UserTO() {
    }

    public UserTO(int userId, String username, String password, String type) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.type = type;
    }
    
    public UserTO(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserTO{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", type=" + type + '}';
    }
    
}
