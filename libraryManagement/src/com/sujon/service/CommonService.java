package com.sujon.service;

import java.util.List;

public interface CommonService<T> {

    void creatTable();

    void save(T t);

    void update(T t);

    void delete(int id);

    T get(int id);

    List<T> getList();

    T getByName(String name);

    T getById(String name);

    List<T> getListById(int id);

    List<T> getListByName(String name);

    T getUserByUsernameAndPassword(String username, String password);

}
