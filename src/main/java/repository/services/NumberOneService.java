package repository.services;

import okhttp3.ResponseBody;
import repository.models.numberonemodels.CreateUser;
import repository.models.numberonemodels.GetListUsers;
import repository.models.numberonemodels.GetSingleUser;
import repository.models.numberonemodels.UpdateUser;
import retrofit2.Call;
import retrofit2.http.*;

public interface NumberOneService {
    @GET ("users")
    Call<GetListUsers> getListUsers(@Query("page") int page);

    @GET("users/{id}")
    Call<GetSingleUser> getUsersId(@Path("id") int id);

    @FormUrlEncoded
    @POST("users")
    Call<CreateUser> createUser(@Field("id") int id, @Field("name") String name,
                                @Field("job")String job);

    @FormUrlEncoded
    @PUT("users/{id}")
    Call<UpdateUser> putUser(@Path("id") int id, @Field("name") String name,
                             @Field("job")String job);
    @FormUrlEncoded
    @PATCH("users/{id}")
    Call<UpdateUser> patchUser(@Path("id") int id, @Field("name") String name,
                             @Field("job")String job);

    @DELETE("users/{id}")
    Call<ResponseBody> deleteUser(@Path("id") int id);
}
