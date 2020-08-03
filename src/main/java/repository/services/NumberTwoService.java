package repository.services;

import okhttp3.ResponseBody;
import repository.models.numbertwoModels.GetListOfTodos;
import retrofit2.Call;
import retrofit2.http.*;

public interface NumberTwoService {

        @GET("todos")
        Call<GetListOfTodos> getListOfTodos();

}
