package airhacks;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AuistianGreeter {

    @Inject
    @ConfigProperty(name="greeting",defaultValue = "some snow")
    String message;
    
    public String hello(){
        return this.message;
    }
}
