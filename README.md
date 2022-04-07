# Pattern Design

Project to execute Factory method and abstract factory

# Factory Method

Execute DesignApplication.java

## Endpoints

### Get Method obtain all products
http://localhost:8080/factory/method/product/all

### Post Method Save Product
http://localhost:8080/factory/method/product

>  **Body**
> {  
"id": 5,  
"name": "Cucuta Campeon",  
"price": 50  
}

## Abstract Factory

### Get Method obtain all employees

http://localhost:8080/factory/abstract/employees/all

###   Get Method obtain all products
http://localhost:8080/factory/abstract/products/all

## For executing database in docker

## Mysql

**Pull mysql**
> docker pull mysql

**Run mysql**
>docker run -d -p 33060:3306 --name mysql-db -e MYSQL_ROOT_PASSWORD=admin mysql

**getting into container to create database in mysql**
>winpty docker exec -it mysql-db mysql -p

>CREATE database patterns;

>USE patterns;

>CREATE table product(  
id INT not null,  
name VARCHAR(100) not null,  
price DECIMAL not null DEFAULT 0.0,  
PRIMARY KEY(id),  
UNIQUE INDEX productName_UNIQUE(name ASC))  
ENGINE=InnoDB  
COMMENT='Tabla de Products';

## Delete a file

You can delete the current file by clicking the **Remove** button in the file explorer. The file will be moved into the **Trash** folder and automatically deleted after 7 days of inactivity.

## Postgres

**Pull mysql**
> docker pull postgres

**Run mysql**
>docker run -d -p 5432:5432 --name postgres-db -e POSTGRES_PASSWORD=admin postgres

**getting into container to create database in postgres**

> winpty docker exec -ti postgres-db psql -U postgres

>CREATE DATABASE patterns;

>\c patterns;

>CREATE TABLE product (  
id INT PRIMARY KEY,  
name VARCHAR ( 100 ) NOT NULL,  
price DOUBLE PRECISION  
);

## Factory Method

```mermaid
classDiagram
IProduct <|--  ConcreteProduct
 class  ConcreteProduct{  
 }
Factory <|--  FactoryImpl


  class  FactoryImpl{  
 +factoryMethod()  
 }
FactoryImpl ..> ConcreteProduct : create