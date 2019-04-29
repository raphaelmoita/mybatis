package org.moita.mapper;

import org.apache.ibatis.annotations.Param;
import org.moita.domain.Company;
import org.moita.domain.Employee;

import java.util.List;

public interface CompanyMapper {

    Company findCompanyById(@Param("id") long id);

    Company findCompanyByName(@Param("name") String name);

    List<Company> findAll();
}
