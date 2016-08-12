/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khmeracademy.btb.auc.pojo.service.impl;

import java.util.ArrayList;
import org.khmeracademy.btb.auc.pojo.entity.Customer;
import org.khmeracademy.btb.auc.pojo.repository.Customer_repository;
import org.khmeracademy.btb.auc.pojo.service.Customer_service;
import org.khmeracademy.btb.auc.pojo.utilities.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class Customer_servicesimpl implements Customer_service{

    @Autowired
    private Customer_repository cus_repo;
    
    @Override
    public ArrayList<Customer> getCustomers(Pagination paginatin) {
        return cus_repo.getCustomers(paginatin);
    }

    @Override
    public boolean remove(int id) {
        return cus_repo.remove(id);
    }

    @Override
    public boolean save(Customer customer) {
        return cus_repo.add(customer);
    }

    @Override
    public boolean update(Customer customer) {
        return cus_repo.update(customer);
    }

    @Override
    public Customer search(int id) {
        return cus_repo.search(id);
    }

    @Override
    public boolean updateBalance(Customer customer) {
        return cus_repo.updateBalance(customer);
    }

    @Override
    public int countCustomer() {
        return cus_repo.countCustomer();
    }

    @Override
    public Customer findUserByEmail(String email) {
        return cus_repo.findUserByEmail(email);
    }
    
}
