package org.moita.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Objects;

public class Employee {

    private long id;

    private long companyId;

    private String name;

    private List<Skill> skills;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                companyId == employee.companyId &&
                Objects.equals(name, employee.name) &&
                Objects.equals(skills, employee.skills);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, companyId, name, skills);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("companyId", companyId)
                .append("name", name)
                .append("skills", skills)
                .toString();
    }
}
