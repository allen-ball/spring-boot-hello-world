/*
 * $Id$
 *
 * Copyright 2018 Allen D. Ball.  All rights reserved.
 */
package ball.hello;

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

    /**
     * Sole constructor.
     */
    public Controller() { }

    @RequestMapping("/")
    public String home() { return "Hello, World!"; }

    @Override
    public String toString() { return super.toString(); }
}
