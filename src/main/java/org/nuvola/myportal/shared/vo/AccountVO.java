package org.nuvola.myportal.shared.vo;

public class AccountVO {
    private ApplicationVO application;
    private AuthorityVO authority;

    public ApplicationVO getApplication() {
        return application;
    }

    public void setApplication(ApplicationVO application) {
        this.application = application;
    }

    public AuthorityVO getAuthority() {
        return authority;
    }

    public void setAuthority(AuthorityVO authority) {
        this.authority = authority;
    }
}
