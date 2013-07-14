package heroku.web;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;
import heroku.web.resources.HomeResource;

/**
 * The DropWizard Service class for this application.
 */
public class WebService extends Service<WebConfiguration> {

    public static void main(String[] args) throws Exception {
        new WebService().run(args);
    }

    @Override
    public void initialize(Bootstrap<WebConfiguration> bootstrap) {
        bootstrap.setName("heroku-web");
        bootstrap.addBundle(new ViewBundle());
    }

    @Override
    public void run(WebConfiguration configuration, Environment environment) {
        environment.addResource(new HomeResource());
    }
}