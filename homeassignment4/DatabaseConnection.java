package org.testleaf.week4.homeassignment4;

//Design an interface DatabaseConnection with abstract methods representing various database methods
public interface DatabaseConnection {

    //Declaring abstract methods
    void connect();
    void disconnect();
    void executeUpdate();

}
