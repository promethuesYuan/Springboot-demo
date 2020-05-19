package com.promethuesYuan.service;


import com.promethuesYuan.dao.EmpDAO;
import com.promethuesYuan.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpDAO empDAO;

    @Override
    public List<Emp> findAll() {
        return empDAO.findAll();
    }

    @Override
    public void save(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDAO.save(emp);
    }

    @Override
    public void delete(String id) {
        empDAO.delete(id);
    }

    @Override
    public Emp find(String id) {
        return empDAO.find(id);
    }

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }
}
