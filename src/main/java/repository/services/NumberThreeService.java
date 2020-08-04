package repository.services;

import repository.models.numberthreemodels.GetPostsList;
import repository.models.numberthreemodels.GetUsersList;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface NumberThreeService {
    @GET("posts")
    Call <List <GetPostsList>> getPostsList();

    @GET("users")
    Call <List <GetUsersList>> getUsersList();

}
