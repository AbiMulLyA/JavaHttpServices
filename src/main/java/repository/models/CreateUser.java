package repository.models;

import com.google.gson.annotations.SerializedName;

public class CreateUser{

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("job")
	private String job;

	public String getCreatedAt(){
		return createdAt;
	}

	public String getName(){
		return name;
	}

	public String getId(){
		return id;
	}

	public String getJob(){
		return job;
	}
}