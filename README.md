# profile-maven

#### profile
  与Spring所提及的profile类似, 不同的阶段, 项目所使用的配置信息往往是不一样的. Maven提供了profile...
```xml
<!-- Maven -->
<profiles>
  <profile>
    <id>dev></dev>
    ....
  </profile>
</profiles>

```
```java
@Profile("dev")
@Bean
public DataSource dataSource() {
  DriverManagerDataSource dataSource = new DriverManagerDataSource();
  dataSource.set....
}
```
#### 几个关键点
- profiles
  上述已举案例, 需要注意的是里面声明的<properties>...往往是一个自定义变量, 根据Maven传输的命令不同, 采用不同的profile
- filters
  过滤器, 设置采用了变量值的文件位置信息, 并且profile中定义的变量将会取代resources中使用了自定义变量的位置(filtering = true)
- resources
  资源
