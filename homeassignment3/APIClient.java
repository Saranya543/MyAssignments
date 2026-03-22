package org.testleaf.week3.homeassignment3;

//create two methods with the same name passing different input arguments
public class APIClient {
    public void sendRequest(String endpoint){
        System.out.println(endpoint);

    }

    public void sendRequest(String endpoint, String requestBody, boolean requestStatus){
        System.out.println(endpoint);
        System.out.println(requestBody);
        System.out.println(requestStatus);

    }

    public static void main(String[] args) {
        APIClient apiOptions = new APIClient();
        apiOptions.sendRequest("endpoint");
        apiOptions.sendRequest("endpoint", "requestBody", false);;

    }

}
