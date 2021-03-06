package repository.clients;

import com.google.gson.Gson;
import repository.generates.PrettyPrintJson;
import repository.services.NumberTwoService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class NumberTwoClient {
    private static final String baseUrl = "https://online-course-todo.herokuapp.com/api/v1/";
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
            System.out.println(PrettyPrintJson.prettyPrint(jsonResponse));
            System.out.println(jsonResponse);
//            var output = new FileOutputStream("src/main/java/repository/items.json");
//            output.write(jsonResponse.getBytes());
//            output.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static Object getDetailsTodo() {
        try{
            var GetDetailsTodo = APIClient.client(
                    NumberTwoService.class,
                    baseUrl)
                    .getDetailsTodo(19)
                    .execute().body();
            String jsonResponse = new Gson().toJson(GetDetailsTodo);
            System.out.println(PrettyPrintJson.prettyPrint(jsonResponse));
//            System.out.println(jsonResponse);
//            var output = new FileOutputStream("src/main/java/repository/items.json");
//            output.write(jsonResponse.getBytes());
//            output.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
