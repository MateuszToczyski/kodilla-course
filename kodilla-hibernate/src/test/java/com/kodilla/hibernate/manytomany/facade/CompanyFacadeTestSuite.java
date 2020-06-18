package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired private CompanyFacade companyFacade;
    @Autowired private CompanyDao companyDao;
    @Autowired private EmployeeDao employeeDao;

    @Test
    public void testFindCompanyBySubstring() {

        String substring = "soft";

        Company company1 = new Company("Apple");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("Ubisoft");

        List<Company> matchingCompanies;

        try {
            companyDao.saveAll(Arrays.asList(company1, company2, company3));
            matchingCompanies = companyFacade.findCompanyBySubstring(substring);
        } finally {
            companyDao.deleteAll(Arrays.asList(company1, company2, company3));
        }

        Assert.assertEquals(2, matchingCompanies.size());
    }

    @Test
    public void testFindEmployeeBySubstring() {

        String substring = "son";

        Employee employee1 = new Employee("John", "Smith");
        Employee employee2 = new Employee("Joe", "Perry");
        Employee employee3 = new Employee("Steve", "Johnson");
        Employee employee4 = new Employee("Richard", "Branson");

        List<Employee> matchingEmployees;

        try {
            employeeDao.saveAll(Arrays.asList(employee1, employee2, employee3, employee4));
            matchingEmployees = companyFacade.findEmployeeBySubstring(substring);
        } finally {
            employeeDao.deleteAll(Arrays.asList(employee1, employee2, employee3, employee4));
        }

        Assert.assertEquals(2, matchingEmployees.size());
    }
}