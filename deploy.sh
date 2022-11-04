#!/bin/sh
./gradlew clean build shadowJar
mv build/libs/keycloak-event-listener-plugin-all.jar build/libs/agosh-keycloak-event-listener-all.jar
docker cp build/libs/agosh-keycloak-event-listener-all.jar local_keycloak:/opt/jboss/keycloak/standalone/deployments/