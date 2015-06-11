package ca.owenpeterson.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import ca.owenpeterson.messenger.model.ErrorMessage;

/**
 * This class is used to catch (map) all DataNotFoundExceptions and return an appropriate response in JSON. 
 * 
 * @author owen
 *
 */
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://owenpeterson.ca");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}
	
	

}
