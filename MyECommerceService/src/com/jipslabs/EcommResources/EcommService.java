package com.jipslabs.EcommResources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.research.ws.wadl.Response;

//public class EcommService implements ServiceInterface {

@Path("/customers")
public class EcommService{
	
	@GET
	@Path("{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCustomer(@PathParam("id") int id){
		APIImpls agent = new APIImpls();		
		String temp = agent.getCustomer(id);		
		return temp;		
	}
	
	/*public Response createCustomer(CustomerData data){
		
		
	}*/
}
