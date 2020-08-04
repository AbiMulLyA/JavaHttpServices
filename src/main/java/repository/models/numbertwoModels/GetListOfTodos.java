package repository.models.numbertwoModels;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GetListOfTodos{

	@SerializedName("data")
	private List<DataItem> data;

	public List<DataItem> getData(){
		return data;
	}
}