package org.config;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface MarketConfig {

        Map<String, MarketConfiguration> config();

        interface MarketConfiguration {
            Optional<LocalDateTime> activeFrom();

            Optional<LocalDateTime> disabledFrom();

            Optional<String> timezone();

            Optional<Set<String>> partners();
        }
    }