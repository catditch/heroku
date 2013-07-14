package heroku.web.views;

import com.yammer.dropwizard.views.View;
import lombok.Getter;
import heroku.web.model.Home;

public class HomeView extends View {

    @Getter
    private final Home home;

    public HomeView(Home home) {
        super("home.ftl");
        this.home = home;
    }
}