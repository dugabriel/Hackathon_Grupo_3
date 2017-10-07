package com.fluig.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("/test")
public class Test {

	private Logger log = LoggerFactory.getLogger(Test.class);

	@GET
	@Path("/get")
	@Produces("application/json")
	public Response testRest(){

		log.info("REST OK!");

		return Response.status(200).build();
	}

}
