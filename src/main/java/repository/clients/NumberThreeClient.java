package repository.clients;

import com.google.gson.Gson;
import repository.generates.PrettyPrintJson;
import repository.services.NumberThreeService;
import java.io.IOException;

public class NumberThreeClient {

    private static final String baseUrl = "https://jsonplaceholder.typicode.com/";
    private static NumberThreeClient numberThreeClient;
    public static NumberThreeClient instance(){
        if(numberThreeClient == null) numberThreeClient = new NumberThreeClient();
        return numberThreeClient;
    }
    public static Object getPostsList() {
        try{
            var GetPostsList = APIClient.client(
                    NumberThreeService.class,
                    baseUrl)
                    .getPostsList()
                    .execute().body();
            String jsonResponse = new Gson().toJson(GetPostsList);
            System.out.println(PrettyPrintJson.prettyPrint(jsonResponse));
//            var output = new FileOutputStream("src/main/java/repository/items.json");
//            output.write(jsonResponse.getBytes());
//            output.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Object getUsersList() {
        try{
            var GetUsersList = APIClient.client(
                    NumberThreeService.class,
                    baseUrl)
                    .getUsersList()
                    .execute().body();
            String jsonResponse = new Gson().toJson(GetUsersList);
            System.out.println(PrettyPrintJson.prettyPrint(jsonResponse));
//            var output = new FileOutputStream("src/main/java/repository/items.json");
//            output.write(jsonResponse.getBytes());
//            output.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
