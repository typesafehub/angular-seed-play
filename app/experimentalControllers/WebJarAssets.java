package experimentalControllers;

import play.api.mvc.Action;
import play.api.mvc.AnyContent;
import play.mvc.Controller;

/**
 * This class is a substitute for the actual WebJarAsset controller just so that
 * we can easily experiment with its API. Ultimately this class will disappear
 * if/when the actual WebJarAssets controller is enhanced.
 */
public class WebJarAssets extends Controller {

    public static Action<AnyContent> atLocation(final String file) {
        return controllers.WebJarAssets.at(controllers.WebJarAssets
                .locate(file));
    }
}
