package ca.owenpeterson.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import ca.owenpeterson.messenger.model.ErrorMessage;

//commented so that it is not used
//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500, "http://www.owenpeterson.ca");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();		
	}
}
