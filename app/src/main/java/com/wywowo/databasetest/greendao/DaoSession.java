package com.wywowo.databasetest.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.wywowo.databasetest.bean.Help;
import com.wywowo.databasetest.bean.Login;
import com.wywowo.databasetest.bean.User;

import com.wywowo.databasetest.greendao.HelpDao;
import com.wywowo.databasetest.greendao.LoginDao;
import com.wywowo.databasetest.greendao.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig helpDaoConfig;
    private final DaoConfig loginDaoConfig;
    private final DaoConfig userDaoConfig;

    private final HelpDao helpDao;
    private final LoginDao loginDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        helpDaoConfig = daoConfigMap.get(HelpDao.class).clone();
        helpDaoConfig.initIdentityScope(type);

        loginDaoConfig = daoConfigMap.get(LoginDao.class).clone();
        loginDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        helpDao = new HelpDao(helpDaoConfig, this);
        loginDao = new LoginDao(loginDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(Help.class, helpDao);
        registerDao(Login.class, loginDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        helpDaoConfig.getIdentityScope().clear();
        loginDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
    }

    public HelpDao getHelpDao() {
        return helpDao;
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
