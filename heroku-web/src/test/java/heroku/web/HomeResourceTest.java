package heroku.web;

import com.sun.jersey.api.client.ClientResponse;
import com.yammer.dropwizard.testing.ResourceTest;
import com.yammer.dropwizard.views.ViewMessageBodyWriter;
import heroku.web.resources.HomeResource;
import org.fest.assertions.api.Assertions;
import org.junit.Test;

/**
 * Tests HomeResource.
 */
public class HomeResourceTest extends ResourceTest {

    @Override
    protected void setUpResources() {
        addResource(new HomeResource());
        addProvider(ViewMessageBodyWriter.class);
    }

    @Test
    public void simpleResourceTest() throws Exception {
        Assertions.assertThat(client()
                .resource("/")
                .get(ClientResponse.class)
                .getEntity(String.class)
        ).contains("Hello World");
    }
}
