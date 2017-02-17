package mimarket.controller;

import mimarket.dao.UserDAO;
import mimarket.dao.factory.AbstractFactoryDAO;
import mimarket.entity.UserTO;

public class UserBLL {

    private UserDAO userDAO;
    
    public UserBLL() {
        userDAO = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getUserDAO();
    }
    
    public UserTO login(String username, String password){
       return userDAO.loginUser(username, password);
    }
    
}
