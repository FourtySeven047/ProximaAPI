package minevalley.proxima.api;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.ApiStatus;

import javax.annotation.Nonnull;

@ApiStatus.Internal
public interface ProximaProvider {

    @Nonnull
    JavaPlugin getInstance();
}