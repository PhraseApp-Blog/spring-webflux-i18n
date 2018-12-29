package com.phraseapp.i18n.springwebflux.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.DelegatingWebFluxConfiguration;
import org.springframework.web.server.i18n.LocaleContextResolver;

import com.phraseapp.i18n.springwebflux.RequestParamLocaleContextResolver;

@Configuration
public class LocaleSupportConfig extends DelegatingWebFluxConfiguration{
    
    @Override
    public LocaleContextResolver localeContextResolver() {
        return new RequestParamLocaleContextResolver();
    }

}
