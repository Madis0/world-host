package io.github.gaming32.worldhost.common;

import eu.midnightdust.lib.config.MidnightConfig;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

public class WorldHostData extends MidnightConfig {
    @Entry
    public static String serverUri = "wss://world-host.jemnetworks.com:9646";

    @Entry
    @Hidden
    public static Set<UUID> friends = new LinkedHashSet<>();
}
