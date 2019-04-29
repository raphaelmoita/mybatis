package org.moita;

import org.apache.ibatis.session.SqlSession;
import org.moita.config.MyBatisConfig;
import org.moita.domain.Company;
import org.moita.mapper.CompanyMapper;

import java.io.IOException;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        try (SqlSession session = MyBatisConfig.session()) {

            CompanyMapper companyMapper = session.getMapper(CompanyMapper.class);
            List<Company> companies = companyMapper.findAll();
            System.out.println(companies);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
