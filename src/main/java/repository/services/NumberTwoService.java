package repository.services;

import repository.models.numbertwoModels.GetDetailsTodo;
import repository.models.numbertwoModels.GetListOfTodos;
import retrofit2.Call;
import retrofit2.http.*;

public interface NumberTwoService {

    @GET("todos")
    Call<GetListOfTodos> getListOfTodos();

    @GET("todos/{id}")
    Call <GetDetailsTodo> getDetailsTodo(@Path("id") int id);

}
