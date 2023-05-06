package ru.tinkoff.edu.java.scrapper.clients.clients.site;

import ru.tinkoff.edu.java.parser_link.responses.BaseParseResponse;

import java.time.OffsetDateTime;
import java.util.Map;

public interface BaseSiteClient {
    Map<String, String> getUpdates(BaseParseResponse response);

    OffsetDateTime getUpdatedDate(BaseParseResponse response);
}
