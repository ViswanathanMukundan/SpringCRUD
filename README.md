# SpringCRUD
Basic CRUD Operations using Spring Boot and MySQL Database
<br>
Requirements for this::: Spring Boot, MySQL Server, and some basic knowledge on what parameters to change.
<br>

In src/main/resources/application.properties, add the database URL, SQL Username and Password for proper authentication.
The table used in this application is created as follows:
<br><br>
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
);
<br><br>

Main() class is present in SpringCrudApplication.java
<br>
Can be validated using any API Platform (Postman) or using curl command in cmd.
