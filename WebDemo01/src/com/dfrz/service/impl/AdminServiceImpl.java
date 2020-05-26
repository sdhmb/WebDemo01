package com.dfrz.service.impl;

import com.dfrz.dao.AdminDao;
import com.dfrz.dao.impl.AdminDaoImpl;
import com.dfrz.entity.Admin;
import com.dfrz.service.AdminService;

public class AdminServiceImpl implements AdminService {

    AdminDao adminDao = new AdminDaoImpl();

    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }

}
