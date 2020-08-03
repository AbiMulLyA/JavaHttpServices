package repository.models.numberonemodels;

import com.google.gson.annotations.SerializedName;

public class GetSingleUser{

	@SerializedName("ad")
	private Ad ad;

	@SerializedName("data")
	private Data data;

	public Ad getAd(){
		return ad;
	}

	public Data getData(){
		return data;
	}
}