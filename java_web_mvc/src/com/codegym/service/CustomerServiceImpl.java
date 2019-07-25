package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    public static Map<Integer, Customer>  customers;


    static {
        customers = new HashMap<>();

        customers.put(1, new Customer(1,"Xuân Mi", "hothixuanmi@gmail.com","Quảng Ngãi"));
        customers.put(2, new Customer(2,"Lương Thị Thanh", "lươngThanh@gmail.com","HÀ Nội"));
        customers.put(3, new Customer(3,"Nguyễn Thị ÁNh Nguyệt", "NguyetVu@gmail.com","Kỳ Phú"));
        customers.put(4, new Customer(4,"Nguyễn Thị Huyền", "Huyenthi@gmail.com","Dak lak"));
        customers.put(5, new Customer(5,"Hồ Thị Diệu Lan", "DieuLan@gmail.com","Quảng Ngãi"));
        customers.put(6, new Customer(6,"Phan Tiến CƯơng", "CuongKien@gmail.com","Huế"));
        customers.put(7, new Customer(7,"Lương BÁ Trạch", "Trach1999@gmail.com","Phật SƠn"));

    }



    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }

}
