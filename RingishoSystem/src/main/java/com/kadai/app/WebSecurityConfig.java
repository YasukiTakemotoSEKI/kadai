package com.kadai.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.kadai.domain.service.EmployeeService;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private EmployeeService employeeService;
	
    /**
     * WebSecurityの設定
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        // 静的リソース(images、css、javascript)とH2DBのコンソールに対するアクセスはセキュリティ設定を無視する
        web.ignoring().antMatchers("/css/**", "/fonts/**", "/images/**", "/js/**", "/h2/**");
    }
    
    /**
     * HttpSecurityの設定
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests()
        // アクセス権限の設定
    	.antMatchers("/css/**", "/fonts/**", "/js/**").permitAll()
        // '/admin/'で始まるURLには、'ADMIN'ロールのみアクセス可
        // .antMatchers("/admin/**").hasRole("ADMIN")
        // 他は制限なし
        .anyRequest().authenticated()
        .and()
        // ログイン処理の設定
        .formLogin()
		// ログイン処理のURL
		.loginPage("/login")
		// ログイン成功時の遷移先URL
		.defaultSuccessUrl("/home", true)
		// usernameのパラメタ名
		.usernameParameter("username")
		// passwordのパラメタ名
		.passwordParameter("password")
		.permitAll()
		.and()
		// ログアウト処理の設定
		.logout()
		// ログアウト処理のURL
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		// ログアウト成功時の遷移先URL
		.logoutSuccessUrl("/login")
		// ログアウト時に削除するクッキー名
		.deleteCookies("JSESSIONID")
		// ログアウト時のセッション破棄を有効化
		.invalidateHttpSession(true)
		.permitAll();
    }
    

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
    	auth.userDetailsService(employeeService).passwordEncoder(passwordEncoder());
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
