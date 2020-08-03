package repository;

import com.google.gson.Gson;
import repository.clients.APIClient;
import repository.models.CreateUser;
import repository.models.GetListUsers;
import repository.models.GetSingleUser;
import repository.services.NumberOneService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public class NumberOneMain {
    private static String baseUrl = "https://reqres.in/api/";
    public static void main(String[] args) throws IOException {
        getListUsers();
//        getUserId();
//        postUser();
    }
    private static void getListUsers() throws IOException {
        APIClient.client(
                NumberOneService.class,
                baseUrl)
                .getListUsers(2)
                .execute().body();
    }
    private static void getUserId() throws IOException {
        APIClient.client(
                NumberOneService.class,
                baseUrl)
                .getUsersId(2)
                .execute().body();
    }

    private static void postUser() {
        APIClient.client(
                NumberOneService.class,
                baseUrl)
                .createUser(1, "Abi", "Developer")
                .enqueue(new Callback<>() {
                    @Override
                    public void onResponse(Call<CreateUser> call,
                                           Response<CreateUser> response) {
                        if (response.code() >= 200 & response.code() <= 299) {
                            System.out.println(new Gson().toJson(response.body()));
                        } else {
                            System.out.println("Maaf response gagal dengan kode " +
                                    response.code());
                        }
                    }

                    @Override
                    public void onFailure(Call<CreateUser> call, Throwable t) {
                        System.out.println(t.getMessage());
                    }
                });
    }
}
