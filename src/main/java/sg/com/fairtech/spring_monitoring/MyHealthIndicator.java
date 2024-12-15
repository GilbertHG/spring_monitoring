package sg.com.fairtech.spring_monitoring;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator extends AbstractHealthIndicator {

    /**
     * Actual health check logic.
     *
     * @param builder the {@link Builder} to report health status and details
     * @throws Exception any {@link Exception} that should create a {@link Status#DOWN}
     *                   system status.
     */
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.status(Status.DOWN);
        builder.withDetail("app", "OK");
        builder.withDetail("error", "NO ERROR");
    }

}
