package org.nuvola.myportal.client;

import org.nuvola.myportal.client.application.ApplicationModule;
import org.nuvola.myportal.client.services.ServiceModule;
import org.nuvola.oauth.client.SSOModule;
import org.nuvola.oauth.client.util.ClientId;

import com.google.gwt.inject.client.AbstractGinModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.gwtplatform.mvp.shared.proxy.RouteTokenFormatter;

public class ClientModule extends AbstractGinModule {
    @Override
    protected void configure() {
        DefaultModule defaultModule = new DefaultModule.Builder()
                .placeManager(DefaultPlaceManager.class)
                .tokenFormatter(RouteTokenFormatter.class)
                .build();

        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.getHome());
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.getHome());
        bindConstant().annotatedWith(ClientId.class).to("portalapp");

        install(defaultModule);
        install(new SSOModule());
        install(new ServiceModule());
        install(new ApplicationModule());
    }
}
