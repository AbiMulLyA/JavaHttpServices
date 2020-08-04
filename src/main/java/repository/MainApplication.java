package repository;

import repository.clients.NumberOneClient;
import repository.clients.NumberThreeClient;
import repository.clients.NumberTwoClient;

public class MainApplication {
    public static void main(String[] args){
        NumberOne();
//        NumberTwo();
//        NumberThree();
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
//        NumberTwoClient.getListOfTodos();
        NumberTwoClient.getDetailsTodo();
        System.exit(0);
    }
    public static void NumberThree(){
//        NumberThreeClient.instance();
        NumberThreeClient.getPostsList();
//        NumberThreeClient.getUsersList();
        System.exit(0);
    }
}
