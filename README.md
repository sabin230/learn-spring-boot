# learn-spring-boot
from  personal Lenovo.  using iluv2code and in28minutes

first create repo in github, clone it to local then  add  files to it  and push. 
Use github desktop

after application (restcontroller) access using:
<http://localhost:8080/courses>

- has commandLineRunner implemented . It is used to run code when application startup
- Exposes /Actuator
- Has OpenAPI (previously swagger using  io.springfox) implemented by using dependency. 
    - No other confirguration needed
    - http://localhost:8080/swagger-ui/index.html#/
    - access raw json using http://localhost:8080/v3/api-docs
