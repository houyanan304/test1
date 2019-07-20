package com.example.demo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.commontypes.AppBean;
import com.example.demo.services.AppService;

@Component
@Path("/")
public class AppResource {

	@Autowired
	private AppService appService;

	@Path("/hello")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public AppBean helloApp(@QueryParam("name") String name) {
		return appService.helloApp(name);
	}
}
