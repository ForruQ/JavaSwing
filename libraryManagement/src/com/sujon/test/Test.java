package com.sujon.test;

import com.sujon.connection.DbConnection;
import com.sujon.service.AdapterService;
import com.sujon.serviceImpl.AuthorServiceImpl;
import com.sujon.serviceImpl.BookRecieveServiceImpl;
import com.sujon.serviceImpl.CategoryServiceImpl;
import com.sujon.serviceImpl.DepartmentServiceImpl;
import com.sujon.serviceImpl.EditionServiceImpl;
import com.sujon.serviceImpl.IssueBookServiceImpl;
import com.sujon.serviceImpl.PublisherServiceImpl;
import com.sujon.serviceImpl.PurchaseServiceImpl;
import com.sujon.serviceImpl.SesssionServiceImpl;
import com.sujon.serviceImpl.StudentServiceImpl;
import com.sujon.serviceImpl.UserServiceImpl;
import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
//        Connection con = DbConnection.getInstance();
//        AdapterService authorService = new AuthorServiceImpl();
//        AdapterService catService = new CategoryServiceImpl();
//        AdapterService departmentService = new DepartmentServiceImpl();
//        AdapterService editionService = new EditionServiceImpl();
//        AdapterService publisherService = new PublisherServiceImpl();
//        AdapterService sessionService = new SesssionServiceImpl();
//        AdapterService purchaseService = new PurchaseServiceImpl();
//        AdapterService studentService = new StudentServiceImpl();
//        AdapterService  isseBookService= new IssueBookServiceImpl();
//        AdapterService  bookRecieveService= new BookRecieveServiceImpl();
        AdapterService  userService= new UserServiceImpl();
        userService.creatTable();
//        bookRecieveService.creatTable();
//        isseBookService.creatTable();
//        studentService.creatTable();
//        purchaseService.creatTable();
//        sessionService.creatTable();
//        publisherService.creatTable();
//        editionService.creatTable();
//        departmentService.creatTable();
//        catService.creatTable();
//        authorService.creatTable();
    }

}
