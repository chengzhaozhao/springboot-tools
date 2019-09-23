package com.czz.springboottools.security.controller.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-23 21:36
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 授权
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        // 订制请求的授权规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");
        // 开启自动登陆功能
        http.formLogin().usernameParameter("user").passwordParameter("pwd").loginPage("/userlogin").loginProcessingUrl("/login");
        // /login 登陆
        // 重定向 /login?error

        // 开启自动注销
        // login?logout
        http.logout().logoutSuccessUrl("/");//注销成功来到首页

        // 开启记住我
        http.rememberMe().rememberMeParameter("remember");

    }

    /**
     * 认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        auth.inMemoryAuthentication().withUser("czz").password("a1990520").roles("VIP1","VIP2")
                .and()
                .withUser("czz2").password("a1990520").roles("VIP2","VIP3")
                .and()
                .withUser("czz2").password("a1990520").roles("VIP1","VIP3");
    }
}
