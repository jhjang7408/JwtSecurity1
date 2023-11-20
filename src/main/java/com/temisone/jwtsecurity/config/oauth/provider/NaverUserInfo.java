package com.temisone.jwtsecurity.config.oauth.provider;

import java.util.Map;

public class NaverUserInfo implements OAuth2UserInfo{

    private Map<String, Object> attributes; // oauth2User.getAttributes()


    // {id=123123123, email=asdf@naver.com, name=기기기} 이런식으로 받아옴
    public NaverUserInfo(Map<String, Object> attributes){
        this.attributes = attributes;
    }


    @Override
    public String getProviderId() {
        return (String)attributes.get("id");
    }

    @Override
    public String getProvider() {
        return "naver";
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}
