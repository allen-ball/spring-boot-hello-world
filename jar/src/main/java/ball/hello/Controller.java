/*
 * $Id$
 *
 * Copyright 2018, 2019 Allen D. Ball.  All rights reserved.
 */
package ball.hello;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot {@link RestController}.  See
 * {@link.uri https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc-controller target=newtab Annotated Controllers}.
 *
 * {@injected.fields}
 *
 * @author {@link.uri mailto:ball@hcf.dev Allen D. Ball}
 * @version $Revision$
 */
@RestController
@NoArgsConstructor @ToString
public class Controller {
    private static final Logger LOGGER = LogManager.getLogger();

    @Value("${greeting}")
    private String greeting;

    @RequestMapping({ "/hello" })
    public String handle() { return greeting; }
}
