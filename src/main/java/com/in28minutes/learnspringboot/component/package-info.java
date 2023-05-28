/**
 * The @Component annotation is a fundamental annotation in Spring framework used to mark a Java class as
 * a Spring-managed component. It is a general-purpose stereotype annotation that indicates a class is a
 * candidate for auto-detection and instantiation as a bean within the Spring context.
 *
 * When you annotate a class with @Component, Spring will automatically detect and register
 * it as a bean during the component scanning process. Component scanning is a mechanism provided by Spring to automatically discover and instantiate Spring beans based on classpath scanning.
 * It provides various helper methods for file manipulation and IO operations.
 *
 * if 3rd party class cannot be annotated with Component, create class with Configuration annotation and define bean
 */
package com.in28minutes.learnspringboot.component;