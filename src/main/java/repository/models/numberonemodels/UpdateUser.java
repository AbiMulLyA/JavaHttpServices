package repository.models.numberonemodels;

import com.google.gson.annotations.SerializedName;

public class UpdateUser{

	@SerializedName("name")
	private String name;

	@SerializedName("job")
	private String job;

	@SerializedName("updatedAt")
	private String updatedAt;

	public String getName(){
		return name;
	}

	public String getJob(){
		return job;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}