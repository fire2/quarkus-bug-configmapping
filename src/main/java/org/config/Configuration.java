package org.config;

import static io.smallrye.config.ConfigMapping.NamingStrategy.VERBATIM;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.config.MarketConfig.MarketConfiguration;

public class Configuration {

    @StaticInitSafe
    @ConfigMapping(prefix = "markets", namingStrategy = VERBATIM)
    public interface BuggyConfig extends MarketConfig {

    }
}
