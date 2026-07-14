package com.app.springboot.config;

import com.app.springboot.shiro.realm_;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import org.apache.shiro.codec.Base64;

@Configuration
public class shiro_filter  {

        @Bean
        public ShiroFilterFactoryBean getshiroFilterFactoryBean(SecurityManager securityManager){
            ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
            shiroFilterFactoryBean.setSecurityManager(securityManager);

            Map<String,String> map =new HashMap<String, String>();
            map.put("/login","anon");
            map.put("/","anon");
            map.put("/authcode.jpg","anon");
            map.put("/static/**","anon");
            map.put("/layuimini/**","anon");
            map.put("/services","anon");
            map.put("/solution","anon");
            map.put("/blog","anon");
            map.put("/successful","anon");
            map.put("/about","anon");
            map.put("/api/**","anon");
            map.put("/logininsert","authc");
            map.put("/loginupdate","authc");
            map.put("/user_username","authc");
            map.put("/upload_image","authc");
            map.put("/article_image","authc");
            map.put("/delete_id","authc");
            map.put("/updateimage","authc");
            map.put("/update_company","authc");
            map.put("/select_company","authc");
            map.put("/show_detailpage","authc");
            map.put("/product","authc");
            map.put("/patents","authc");
            map.put("/case","authc");
            map.put("/solution","authc");
            map.put("/user/**","authc");

            shiroFilterFactoryBean.setLoginUrl("/login");
            shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
            return shiroFilterFactoryBean;
        }

        @Bean
    public DefaultWebSecurityManager securityManager(Realm realm){
            DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
            securityManager.setRealm(realm);
            
            CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
            SimpleCookie cookie = new SimpleCookie("rememberMe");
            cookie.setHttpOnly(true);
            cookie.setMaxAge(604800);
            rememberMeManager.setCookie(cookie);
            
            byte[] cipherKey = Base64.decode("kPH+bIxk5D2deZiIxcaaaA==");
            rememberMeManager.setCipherKey(cipherKey);
            
            securityManager.setRememberMeManager(rememberMeManager);

            return securityManager;
        }

        @Bean
        public Realm getrealm(){
            return new realm_();
        }

}