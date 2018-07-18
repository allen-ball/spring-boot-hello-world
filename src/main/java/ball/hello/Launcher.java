/*
 * $Id$
 *
 * Copyright 2018 Allen D. Ball.  All rights reserved.
 */
package ball.hello;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link SpringApplication} {@link Launcher}
 *
 * @author {@link.uri mailto:ball@iprotium.com Allen D. Ball}
 * @version $Revision$
 */
@SpringBootApplication
public class Launcher {
    private static final Logger LOGGER = LogManager.getLogger();

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
        SpringApplication application = new SpringApplication(Launcher.class);

        LOGGER.debug(() -> Arrays.toString(argv));

        application.run(argv);
    }

    /**
     * Sole constructor.
     */
    public Launcher() { }

    @Override
    public String toString() { return super.toString(); }
}
