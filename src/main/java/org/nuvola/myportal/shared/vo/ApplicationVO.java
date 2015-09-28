package org.nuvola.myportal.shared.vo;

import java.util.ArrayList;
import java.util.List;

public class ApplicationVO {
    private Long id;
    private String name;
    private String clientId;
    private String url;
    private String clientSecret;
    private List<AuthorityVO> authorities;

    public ApplicationVO() {
        authorities = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public List<AuthorityVO> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthorityVO> authorities) {
        this.authorities = authorities;
    }
}
