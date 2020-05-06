package com.sujon.test;

import com.sujon.connection.DbConnection;
import com.sujon.pojo.Admission;
import com.sujon.pojo.Classes;
import com.sujon.service.CommonService;
import com.sujon.serviceImpl.AdmissionServiceImpl;
import com.sujon.serviceImpl.ClassServiceImpl;
import com.sujon.serviceImpl.FeeServiceImpl;
import com.sujon.serviceImpl.PaymentServiceImpl;
import com.sujon.serviceImpl.TeacherServiceImpl;
import com.sujon.serviceImpl.UserServiceImpl;
import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        Connection con = DbConnection.getInstance();
        CommonService userService = new UserServiceImpl();
        CommonService classService = new ClassServiceImpl();
        CommonService addmissionService = new AdmissionServiceImpl();
        CommonService feeService = new FeeServiceImpl();
        CommonService teacherService = new TeacherServiceImpl();
        CommonService paymentService = new PaymentServiceImpl();
        userService.createTable();
        classService.createTable();
        addmissionService.createTable();
        teacherService.createTable();
        paymentService.createTable();
        feeService.createTable();

//        Admission s1 = new Admission(1, "hasan", "1", "A", "12", "Male", "2001-07-01", "hamid", "jahanara", "9458", "dhaka");
//        inService.save(s1);
//        Student s2 = new Student("Swarna", "swarna@gmail.com", "Female", "Round-43", "Ok");
//        inService.save(s2);
//       Student s3 = new Student("Romana", "romana@gmail.com", "Female", "Round-43", "Ok");
//       inService.save(s3);
//        Classes s4 = new Classes("2", "B");
//        inService.save(s4);
//        
//       inService.delete(1);
//        Student student = (Student) inService.get(1);
//        System.out.println("Name: " + student.getName() + " Note: " + student.getNote());
//        List<Student> list = inService.getList();
//        for (Student s : list) {
//            System.out.println("Name: " + s.getName() + " Note: " + s.getNote());
//        }
        teacherService.getListById(1);

    }

}
