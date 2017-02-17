package mimarket.dao.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import mimarket.dao.UserDAO;
import mimarket.dao.factory.AbstractFactoryDAO;
import mimarket.entity.UserTO;

public class MySQLUserDAO implements UserDAO {

    Connection cn = null;
    CallableStatement cs = null;
    ResultSet rs = null;
    String sql;

    @Override
    public UserTO loginUser(String username, String password) {
        UserTO userTO = null;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_login_user(?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, username);
            cs.setString(2, password);
            rs = cs.executeQuery();

            if (rs.next()) {
                userTO = new UserTO();
                userTO.setUserId(rs.getInt(1));
                userTO.setUsername(rs.getString(2));
                userTO.setPassword(rs.getString(3));
                userTO.setType(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return userTO;
    }

    @Override
    public boolean insertUser(UserTO userTO) {
        boolean insert = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_insert_user(?,?,?)}";
            cs = cn.prepareCall(sql);

            cs.setString(1, userTO.getUsername());
            cs.setString(2, userTO.getPassword());
            cs.setString(3, userTO.getType());

            cs.execute();
            insert = true;
        } catch (Exception e) {
            e.printStackTrace();
            insert = false;
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return insert;
    }

    @Override
    public boolean updateUser(UserTO userTO) {
        boolean update = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_update_user(?,?,?,?)}";
            cs = cn.prepareCall(sql);

            cs.setInt(1, userTO.getUserId());
            cs.setString(2, userTO.getUsername());
            cs.setString(3, userTO.getPassword());
            cs.setString(4, userTO.getType());

            cs.execute();
            update = true;
        } catch (Exception e) {
            e.printStackTrace();
            update = false;
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return update;
    }

    @Override
    public boolean deleteUser(int userId) {
        boolean delete = false;
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            String sql = "{call sp_delete_user(?)}";
            cs = cn.prepareCall(sql);

            cs.setInt(1, userId);

            cs.execute();
            delete = true;
        } catch (Exception e) {
            e.printStackTrace();
            delete = false;
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }
        return delete;
    }

    @Override
    public  ArrayList<UserTO> findAllUsers() {
        ArrayList<UserTO> users = new ArrayList<>();
        try {
            cn = AbstractFactoryDAO.getFactory(AbstractFactoryDAO.MYSQL).getConnection();
            sql = "{call sp_find_all_users()}";
            cs = cn.prepareCall(sql);
            rs = cs.executeQuery();

            while (rs.next()) {
                UserTO userTO = new UserTO();
                userTO.setUserId(rs.getInt(1));
                userTO.setUsername(rs.getString(2));
                userTO.setPassword(rs.getString(3));
                userTO.setType(rs.getString(4));
                users.add(userTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            AbstractFactoryDAO.close(cn, cs, rs);
        }

        return users;
    }

}
