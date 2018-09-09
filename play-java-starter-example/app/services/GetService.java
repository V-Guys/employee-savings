package services;

import java.util.List;

import dto.CustomerDto;
import manager.GetManager;

public class GetService {
	private GetManager getManager;
	public List<CustomerDto> getDetails()
	{
		return getManager.getdetails();
	}

}
