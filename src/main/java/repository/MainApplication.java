package repository;

import repository.clients.NumberOneClient;
import repository.clients.NumberTwoClient;

public class MainApplication {
    public static void main(String[] args){
//        NumberOne();
        NumberTwo();
    }
    public static void NumberOne(){
        NumberOneClient.instance();
        NumberOneClient.getListUsers();
        NumberOneClient.getUserId();
        NumberOneClient.postUser();
        NumberOneClient.put();
        NumberOneClient.patch();
        NumberOneClient.delete();
        System.exit(0);
    }
    public static void NumberTwo(){
        NumberTwoClient.instance();
        NumberTwoClient.getListOfTodos();
    }
}
