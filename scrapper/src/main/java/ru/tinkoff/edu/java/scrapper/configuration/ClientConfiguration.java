package ru.tinkoff.edu.java.scrapper.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tinkoff.edu.java.scrapper.clients.clients.StackOverFlowClient;
import ru.tinkoff.edu.java.scrapper.clients.clients.GitHubClient;

@Configuration
@RequiredArgsConstructor
public class ClientConfiguration {
    private final GitHubConfig gitHubConfig;
    private final StackOverFlowConfig stackOverFlowConfig;
    @Bean("GitHubClient")
    public GitHubClient getGitHubClient() {
        return new GitHubClient(gitHubConfig);
    }

    @Bean("StackOverFlowClient")
    public StackOverFlowClient getStackOverFlowClient() {
        return new StackOverFlowClient(stackOverFlowConfig);
    }

    @Bean("SchedulerUpdateLink")
    public long schedulerIntervalMs(ApplicationConfig config) {
        return config.scheduler().interval().toMillis();
    }
}
