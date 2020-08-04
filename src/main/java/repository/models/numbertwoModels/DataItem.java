package repository.models.numbertwoModels;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("task")
	private String task;

	@SerializedName("id")
	private int id;

	@SerializedName("status")
	private boolean status;

	@SerializedName("updatedAt")
	private String updatedAt;

	public String getCreatedAt(){
		return createdAt;
	}

	public String getTask(){
		return task;
	}

	public int getId(){
		return id;
	}

	public boolean isStatus(){
		return status;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}