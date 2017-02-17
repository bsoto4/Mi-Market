package mimarket.dao;

import java.util.ArrayList;
import mimarket.entity.UserTO;

public interface UserDAO {
    
    public UserTO loginUser(String username, String password);
    public boolean insertUser(UserTO userTO);
    public boolean updateUser(UserTO userTO);
    public boolean deleteUser(int userId);
    public ArrayList<UserTO> findAllUsers();

}
