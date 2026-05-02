package eu.minevalley.proxima.api;

import eu.minevalley.proxima.api.command.Command;
import eu.minevalley.proxima.api.user.User;
import org.jetbrains.annotations.Contract;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public abstract class AbstractModule {

    /**
     * Is called when the module is enabled.
     */
    public void onEnable() {
        // override this method to add logic
    }

    /**
     * Is called when the module is disabled.
     */
    public void onDisable() {
        // override this method to add logic
    }

    /**
     * Gets this modules instance of the {@link Command} registry.
     *
     * @return this modules instance of the Commands registry
     */
    @Nonnull
    @Contract(pure = true)
    public abstract Command<? extends User> command();
}