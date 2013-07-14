package heroku.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The 'home' model object for this application.
 */
@AllArgsConstructor
public class Home {

    @Getter
    private final String message;
}
