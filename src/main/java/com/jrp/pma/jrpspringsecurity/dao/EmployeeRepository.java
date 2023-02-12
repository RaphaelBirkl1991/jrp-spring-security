package com.jrp.pma.jrpspringsecurity.dao;

import com.jrp.pma.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();

//    @Query(nativeQuery = false, value=
//            "SELECT Employee.firstName as firstName, Employee.lastName as lastName, COUNT(Employee.employeeId ) as projectCount " +
//            "FROM Employee left join Project ON Employee.employeeId " +
//            "GROUP BY Employee .firstName, Employee.lastName ORDER BY 3 DESC")
//    public List<Employee> employeeProjects();
}
