package heroku.web.resources;

import com.yammer.metrics.annotation.Timed;
import heroku.web.model.Home;
import heroku.web.views.HomeView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The 'home' resource for this application.
 */
@Path("/")
@Produces(MediaType.TEXT_HTML)
public class HomeResource {

    @GET
    @Timed
    public HomeView getHome() {
        return new HomeView(new Home("Hello World"));
    }
}