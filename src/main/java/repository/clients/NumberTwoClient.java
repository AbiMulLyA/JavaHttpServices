package repository.clients;

import com.google.gson.Gson;
import repository.services.NumberTwoService;

import java.io.IOException;

public class NumberTwoClient {
    private static final String baseUrl = "http://jsonplaceholder.typicode.com/";
    private static NumberTwoClient numberTwoClient;
    public static NumberTwoClient instance(){
        if(numberTwoClient == null) numberTwoClient = new NumberTwoClient();
        return numberTwoClient;
    }
    public static Object getListOfTodos() {
        try{
            var GetListUsers = APIClient.client(
                    NumberTwoService.class,
                    baseUrl)
                    .getListOfTodos()
                    .execute().body();
            String jsonResponse = new Gson().toJson(GetListUsers);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
