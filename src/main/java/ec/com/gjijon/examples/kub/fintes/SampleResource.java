package ec.com.gjijon.examples.kub.fintes;

import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("sample")
public class SampleResource {

  @Inject
  @ConfigProperty(name = "message")
  private String message;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{nombre}")
  public Response message(
		  @DefaultValue("SIN NOMBRE ESPECIFICADO")
		  @PathParam("nombre")
		  String nombre) {
	  System.out.printf("Parametro de llegada: %s", nombre);
	  RetornoDTO rdto = new RetornoDTO(nombre);
    return Response.ok(rdto).build();
  }

}
