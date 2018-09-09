package manager;

import dto.CustomerDto;
import repository.GetRepository;

public class GetManager {
	private GetRepository getRepository;
	public CustomerDto getDetails()
	{
		return getRepository.findDetails();
	}
	public void change()
	{
		
	}

}
