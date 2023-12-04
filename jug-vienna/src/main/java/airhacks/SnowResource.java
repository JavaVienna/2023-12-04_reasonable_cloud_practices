package airhacks;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("snow")
@ApplicationScoped
public class SnowResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String snow(){
        return "let it snow";
    }
}
