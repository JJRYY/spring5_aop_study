package spring5_aop_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.ImpeCalculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.aspect.CacheAspect;
import spring5_aop_study.aspect.ExeTimeAspect;

/*
 * @Aspect 애노테이션을 붙인 클래스를 공통 기능으로 적용하려면 @EnableAspectJAutoProxy 애노테이션을 설정 클래스에 붙여야 한다.
 * @EnableAspectJAutoProxy - 스프링은 @Aspect 애노테이션이 붙은 빈 객체를 찾아서 빈 객체의 @Pointcut 설정과 @Around 설정을 사용한다.
 */
@Configuration
@EnableAspectJAutoProxy
public class AppCtxWithCache {

	@Bean
	public CacheAspect cacheAspect() {
		return new CacheAspect();
	}
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
	
}
