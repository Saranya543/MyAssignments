package org.testleaf.week4.homeassignment4;

//Implementing abstract methods of DatabaseConnection inteface in this concrete class
public class JavaConnection extends MySqlConnection{
    //Implementing abstract methods from interface
    public void connect(){
        System.out.println("Connect");
    }

    public void disconnect(){
        System.out.println("Disconnect");
    }

    public void executeUpdate(){
        System.out.println("ExecuteUpdate");
    }

    public static void main(String[] args) {

        //Creating object for Concrete class and calling the methods from interface and abstract class
        JavaConnection javaOptions = new JavaConnection();
        javaOptions.connect();
        javaOptions.disconnect();
        javaOptions.executeUpdate();
        javaOptions.executeQuery();
        
    }

}
