package repository.services;

import java.util.List;

import repository.models.CreateUser;
import repository.models.GetListUsers;
import repository.models.GetSingleUser;
import retrofit2.Call;
import retrofit2.http.*;

public interface NumberOneService {
//    @GET("users")
//    Call<List <NumberOneModels>> getUsers();

    @GET ("users")
    Call<GetListUsers> getListUsers(@Query("page") int page);

    @GET("users/{id}")
    Call<GetSingleUser> getUsersId(@Path("id") int id);

    @FormUrlEncoded
    @POST("users")
    Call<CreateUser> createUser(@Field("id") Integer id, @Field("name") String name,
                                @Field("job")String job);
}
