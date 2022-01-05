# Java Spring Project

In this project, a sample application for using spring with java is described. For this example, two linked tables will be created, named company and employee. **Adding, deleting, updating and listing** operations will be done to these tables using **Postman** and **MYSQL**.


# Requirements

- **Intellij Idea**
- **MYSQL**
- **Postman**

## Creating a project in Intellij Idea

![](https://lh6.googleusercontent.com/7zqg4ybSBFJe2Y-Y0PdmW8hlwQIaeQHNXUnd99X6Z94T42xrzzf0Iie1Ex6VDy0PKjZUHUfo8-GBUSu0vuYRZudaWgKEXiGsJEXulWAzA3z-KfUd41FD6M2OERwDpFyKRFdgrX4U)
>Note : Due to the some version errors Project SDK verison must be earlier than version 13.

With Spring Initializr, adjustments are made as in the figure and the following should be added as Dependencies:
 - Lombok,  
 - Spring Web,  
 - H2 Database,  
 - Mysql Driver,  
 - Spring Data JPA

**Within the project:**
Entities are created for the company and the employee. The connection between these entities is made one to M. In other words, each company can have more than one employee, but an employee cannot have more than one company. Then the interface repository is created for both entities.

❗ The database connection must be set in the data source and drivers section on the left.
Then, separate controller files and service files are created for the Company and Employee, where the control will be provided for these two entities.
After the project is run, the entities tables created in the project are displayed as empty on MySql Workbench.


Now we can add information to our tables with the post operation via postman. 🎉


# Postman

- Write an employee information in Json format in Postman and perform the post process.
	> {
"name": "Mathew",
"surname": "Sparkle",
"company":"Google",
"email":"sparkle@gmai.com",
"phone":"9999999999"
}
