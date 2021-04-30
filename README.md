# E-commerce Project Using Spring Boot</h3>

# Tech spec
* java 1.8
* spring boot 2.3
* maven
* junit 5

#Code structures (Modules/class Introduction)

**modules and packages inside main**

* src/main/java/com/api/spring/entity - contain  entity class(Related to database table)
* src/main/java/com/api/spring/repository - contain repository interface,resposible to get data from database
* src/main/java/com/api/spring/rest - contain rest end-point and its model (dto)
* src/main/java/com/api/spring/custom/exception - contain exception related code
* src/main/java/com/api/spring/service - contain business logic
* src/main/resources - contain aplication properties

#How to run

* Server will run 8080 port by default
* API Documentation

  ```http://localhost:8080/api/private```
    

# End points

**create new order.**
* id : Integer, primary key,auto generate 
* totalPrice : BigDecimal, can not be null
* orderItems_id : OrderItems type
* orderStatus_id : OrderStatus type

//There is a relationship between order, user and orderItems

//create order

// get order by id

//update order

//delete order by id
