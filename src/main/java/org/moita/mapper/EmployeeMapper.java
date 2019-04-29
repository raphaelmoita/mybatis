package org.moita.mapper;

import org.apache.ibatis.annotations.Param;
import org.moita.domain.Employee;

import java.util.List;

public interface EmployeeMapper {

    Employee findEmployeeById(@Param("id") long id);

    Employee findEmployeeByName(@Param("name") String name);

    List<Employee> findAll();
}
