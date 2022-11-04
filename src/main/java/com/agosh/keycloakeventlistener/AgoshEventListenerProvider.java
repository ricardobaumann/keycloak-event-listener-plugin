package com.agosh.keycloakeventlistener;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

import java.util.Map;

@Slf4j
@AllArgsConstructor
public class AgoshEventListenerProvider implements EventListenerProvider {

    private final ObjectMapper objectMapper;

    @Override
    @SneakyThrows
    public void onEvent(Event event) {
        log.info("Agosh keycloak event: {}", objectMapper.writeValueAsString(event));
    }

    @Override
    @SneakyThrows
    public void onEvent(AdminEvent event, boolean includeRepresentation) {
        log.info("Agosh keycloak ADMIN event: {}", objectMapper.writeValueAsString(event));
    }

    @Override
    public void close() {

    }
}
