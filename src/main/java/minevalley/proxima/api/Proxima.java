package minevalley.proxima.api;

import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;

@SuppressWarnings({"unused", "UnusedReturnValue"})
public final class Proxima {

    private static ProximaProvider provider;

    /**
     * Get the JavaPlugin instance of CorePlugin.
     * <br>
     * This gives you access to some Bukkit features that rely on this instance.
     *
     * @return JavaPlugin instance of CorePlugin
     */
    @Nonnull
    public static JavaPlugin getInstance() {
        return provider.getInstance();
    }
}