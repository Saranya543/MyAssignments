package org.testleaf.week4.homeassignment4;

//Create an Abstract Class MySqlConnection that implements DatabaseConnection interface
public abstract class MySqlConnection implements DatabaseConnection{

    public void executeQuery(){
        System.out.println("ExecuteQuery");
    }

}
