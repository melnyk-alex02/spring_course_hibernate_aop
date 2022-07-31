package com.alex.spring.mvc_hibernate_aop.DAO;

import com.alex.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class Employee_dao_impl implements Employee_dao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
       Session session = sessionFactory.getCurrentSession();

       Employee emp = session.get(Employee.class, id);
       return emp;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Employee where id =:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
