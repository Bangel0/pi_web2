package com.integrador.sysmarket.Logging;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SecurityLogger {

    private static final Logger logger = LoggerFactory.getLogger(SecurityLogger.class);

    @EventListener
    public void handleSuccess(AuthenticationSuccessEvent event) {
        String user = event.getAuthentication().getName();
        logger.info(" Successful login for user: {}", user);
    }

    @EventListener
    public void handleFailure(AuthenticationFailureBadCredentialsEvent event) {
        String user = (String) event.getAuthentication().getPrincipal();
        logger.warn(" Login failure for user: {}", user);
    }
}
