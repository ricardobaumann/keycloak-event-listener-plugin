package com.agosh.keycloakeventlistener;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.keycloak.Config;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class AgoshEventListenerProviderFactory implements EventListenerProviderFactory {
    @Override
    public EventListenerProvider create(KeycloakSession session) {
        return new AgoshEventListenerProvider(new ObjectMapper());
    }

    @Override
    public void init(Config.Scope config) {

    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return "agosh-event-listener";
    }
}
