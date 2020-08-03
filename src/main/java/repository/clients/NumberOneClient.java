package repository.clients;

import com.google.gson.Gson;
import repository.services.NumberOneService;

import java.io.IOException;

public class NumberOneClient {
    private static final String baseUrl = "https://reqres.in/api/";
    private static NumberOneClient numberOneClient;
    public static NumberOneClient instance(){
        if(numberOneClient == null) numberOneClient = new NumberOneClient();
        return numberOneClient;
    }
    public static Object getListUsers() {
        try{
            var GetListUsers = APIClient.client(
                    NumberOneService.class,
                    baseUrl)
                    .getListUsers(2)
                    .execute().body();
            String jsonResponse = new Gson().toJson(GetListUsers);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static Object getUserId(){
        try{
            var GetUsersId = APIClient.client(
                    NumberOneService.class,
                    baseUrl)
                    .getUsersId(2)
                    .execute().body();
            String jsonResponse = new Gson().toJson(GetUsersId);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Object postUser() {
        try{
            var PostUser = APIClient.client(
                    NumberOneService.class,
                    baseUrl)
                    .createUser(1, "Abi", "Developer")
                    .execute().body();
            String jsonResponse = new Gson().toJson(PostUser);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Object put(){
        try{
            var PutUser = APIClient.client(
                    NumberOneService.class,
                    baseUrl)
                    .putUser(2, "Abi", "Engineer")
                    .execute().body();
            String jsonResponse = new Gson().toJson(PutUser);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Object patch(){
        try{
            var PatchUser = APIClient.client(
                    NumberOneService.class,
                    baseUrl)
                    .patchUser(2, "Abi", "CTO")
                    .execute().body();
            String jsonResponse = new Gson().toJson(PatchUser);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Object delete(){
        try{
            var DeleteUser = APIClient.client(
                    NumberOneService.class,
                    baseUrl)
                    .deleteUser(2)
                    .execute().body();
            String jsonResponse = new Gson().toJson(DeleteUser);
            System.out.println(jsonResponse);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
