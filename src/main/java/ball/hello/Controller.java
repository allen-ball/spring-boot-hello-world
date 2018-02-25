/*
 * $Id$
 *
 * Copyright 2018 Allen D. Ball.  All rights reserved.
 */
package ball.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot {@link RestController}
 *
 * @author {@link.uri mailto:ball@iprotium.com Allen D. Ball}
 * @version $Revision$
 */
@RestController
public class Controller {
    @Value("${greeting}")
    private String greeting;

    /**
     * Sole constructor.
     */
    public Controller() { }

    @RequestMapping("/hello")
    public String home() { return greeting; }

    @Override
    public String toString() { return super.toString(); }
}
