package org.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import java.util.Map;
import org.config.Configuration.BuggyConfig;
import org.config.MarketConfig.MarketConfiguration;
import org.junit.jupiter.api.Test;

@QuarkusTest
class ConfigurationTest {

  @Inject
  BuggyConfig buggyConfig;

  @Test
  void loadsMarketsCorrectly_fromInterfaceExtension() {
    Map<String, MarketConfiguration> markets = buggyConfig.config();
    assertEquals(2, markets.size());

    MarketConfiguration germanMarket = markets.get("de");
    assertTrue(germanMarket.activeFrom().isPresent());
    assertTrue(germanMarket.disabledFrom().isPresent());
    assertTrue(germanMarket.timezone().isPresent());
    assertTrue(germanMarket.partners().isEmpty());
  }

}