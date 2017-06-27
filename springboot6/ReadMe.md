# [Springboot 学习demo]https://github.com/zconggithub/zcgithub.git
create by 周聪 	QQ：2632652610	
#					<<Springboot6有效数据验证>>
作为服务端开发，验证前端传入的参数的合法性是一个必不可少的步骤，但是验证参数是一个基本上是一个体力活，而且冗余代码繁多，也影响代码的可阅读性，所以有没有一个比较优雅的方式来解决这个问题？

这主要讲一下解决基于spring-boot的验证参数的比较好的方法：利用validator-api来进行验证参数。

在spring-boot-starter-web包里面有hibernate-validator包，它提供了一系列验证各种参数的方法，所以说spring-boot已经帮我们想好要怎么解决这个问题了。

项目中导入的依赖：
		<!-- 提供了一系列验证各种参数的方法 -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
#	<<<<		Hibernate Validator 注解用法	>>>>
Bean Validation 中内置的 constraint    
     
@Null   被注释的元素必须为 null    
@NotNull    被注释的元素必须不为 null    
@AssertTrue     被注释的元素必须为 true    
@AssertFalse    被注释的元素必须为 false    
@Min(value)     被注释的元素必须是一个数字，其值必须大于等于指定的最小值    
@Max(value)     被注释的元素必须是一个数字，其值必须小于等于指定的最大值    
@DecimalMin(value)  被注释的元素必须是一个数字，其值必须大于等于指定的最小值    
@DecimalMax(value)  被注释的元素必须是一个数字，其值必须小于等于指定的最大值    
@Size(max=, min=)   被注释的元素的大小必须在指定的范围内    
@Digits (integer, fraction)     被注释的元素必须是一个数字，其值必须在可接受的范围内    
@Past   被注释的元素必须是一个过去的日期    
@Future     被注释的元素必须是一个将来的日期    
@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式    
    
Hibernate Validator 附加的 constraint    
@NotBlank(message =)   验证字符串非null，且长度必须大于0    
@Email  被注释的元素必须是电子邮箱地址    
@Length(min=,max=)  被注释的字符串的大小必须在指定的范围内    
@NotEmpty   被注释的字符串的必须非空    
@Range(min=,max=,message=)  被注释的元素必须在合适的范围内  