# learn-spring-boot
from  personal Lenovo.  using iluv2code and in28minutes

first create repo in github, clone it to local then  add  files to it  and push. 
Use github desktop

after application (restcontroller) access using:
<http://localhost:8080/courses>

- has commandLineRunner implemented . It is used to run code when application startup
- Exposes /Actuator
- http://localhost:8080/actuator
- <http://localhost:8080/actuator/beans>
- Has OpenAPI (previously swagger using  io.springfox) implemented by using dependency. 
    - No other confirguration needed
    - http://localhost:8080/swagger-ui/index.html#/
    - access raw json using http://localhost:8080/v3/api-docs

Use thymeleaf dependecy to show error.html if mapping not found
http://localhost:8080/hello

also has
http://localhost:8080/dailyworkout 
uses @Configuration and @Bean to get SwimCoach (it does not have @Controller)

http://localhost:8080/dailyworkout2
use @Component to get CricketCoach. See the rest controller

# for jpa , postgres, to start pgadmin and postgres
C:\Users\sabin\OneDrive\Documents\docker_pg_demo>docker-compose up -d
<https://github.com/sabin230/docker_pg_demo>

jdbc:postgresql://localhost:5432/testdb (although docker host is 172.22.0.21 , it is exposed to localhost 5432)
database:testdb
table: public.employee
http://localhost:8080/api/employees  returns json
check from pgadmin or dbbeaver