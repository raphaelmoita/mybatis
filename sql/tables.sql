CREATE DATABASE mybatisdb;
USE mybatisdb;
CREATE USER 'mybatis'@localhost identified BY 'm1b4t1s';
GRANT ALL privileges ON mybatisdb.* to mybatis@localhost;
FLUSH PRIVILEGES;

CREATE TABLE employee (id INTEGER NOT null, name VARCHAR(255) NOT null, company_id INTEGER NOT null, PRIMARY KEY(id));
CREATE TABLE company (id INTEGER NOT null, name VARCHAR(255) NOT null, PRIMARY KEY(id));
CREATE TABLE skill (employee_id INTEGER NOT null, description VARCHAR(50) NOT null, PRIMARY KEY(employee_id, description));

INSERT INTO employee VALUE (1, 'Raphael', 1);
INSERT INTO employee VALUE (2, 'Mariana', 2);
INSERT INTO employee VALUE (3, 'Jose', 1);
INSERT INTO employee VALUE (4, 'Maria', 2);

INSERT INTO company VALUE (1, 'Luxoft');
INSERT INTO company VALUE (2, 'UBS');

INSERT INTO skill VALUE (1, 'JAVA');
INSERT INTO skill VALUE (1, 'ORACLE');
INSERT INTO skill VALUE (2, 'JAVASCRIPT');
INSERT INTO skill VALUE (2, 'WINDOWS');

