package org.acme;

import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;
import org.eclipse.microprofile.config.spi.ConfigSource;

public class ConfigSourceFactoryImpl implements ConfigSourceFactory {
    @Override
    public Iterable<ConfigSource> getConfigSources(ConfigSourceContext context) {
        return null;
    }
}
