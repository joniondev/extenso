#!/bin/bash
PROJETO=~/NetBeansProjects/javaonion
JBOSS=~/jboss-eap-5.1/jboss-as
DEPLOY=${JBOSS}/server/default/deploy

mvn3 clean install --file ${PROJETO}/ExtensoWS/pom.xml

rm ${DEPLOY}/ExtensoWS-1.0-SNAPSHOT.war \
   ${DEPLOY}/ExtensoEJB-1.0-SNAPSHOT.jar
cp ${PROJETO}/ExtensoWS/target/ExtensoWS-1.0-SNAPSHOT.war \
   ${PROJETO}/ExtensoEJB/target/ExtensoEJB-1.0-SNAPSHOT.jar \
   ${DEPLOY}

tail -f ${DEPLOY}/../log/server.log

