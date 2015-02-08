#!/bin/bash

# Installs the security realm in glassfish
# for development only
#
# shofmann, 03.02.2015


# read the default properties
source ./config.sh

# start server
asadmin start-domain $DOMAIN

# delete old realm if exists
asadmin delete-auth-realm $REALM_NAME

# create the realm
asadmin create-auth-realm \
	--classname="com.sun.enterprise.security.auth.realm.jdbc.JDBCRealm" \
	--property jaas-context=jdbcRealm:datasource-jndi=$DS_NAME:user-table=user_role_view:user-name-column=username:password-column=password:group-table=user_role_view:group-name-column=role:digest-algorithm=SHA-256:encoding=Base64:charset=UTF-8 $REALM_NAME

# stop server
asadmin stop-domain $DOMAIN
