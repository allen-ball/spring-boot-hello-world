/*
 * $Id$
 *
 * Copyright 2018 Allen D. Ball.  All rights reserved.
 */
package ball.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link SpringBootApplication}
 *
 * @author {@link.uri mailto:ball@iprotium.com Allen D. Ball}
 * @version $Revision$
 */
@SpringBootApplication
public class Application {

    /**
     * Standard {@link SpringApplication} {@code main(String[])} entry
     * point.
     *
     * @param   argv            The command line argument vector.
     *
     * @throws  Exception       If the function does not catch
     *                          {@link Exception}.
     */
    public static void main(String[] argv) throws Exception {
        SpringApplication.run(Application.class, argv);
    }

    /**
     * Sole constructor.
     */
    public Application() { }

    @Override
    public String toString() { return super.toString(); }
}
