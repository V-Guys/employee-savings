package controllers;

import play.api.mvc.Result;
import play.libs.Json;
import services.GetService;

/**
 * @author Chiba
 *
 */
public class GetController {
	private GetService getService;
	public Result getdetails()
	{
		return ok(Json.toJson(getService.getDetails());
		
		
	}

}
