package ru.tinkoff.edu.java.scrapper.persistence.repository.repository;

import ru.tinkoff.edu.java.scrapper.exceptions.repository.BadEntityException;
import ru.tinkoff.edu.java.scrapper.exceptions.repository.DuplicateUniqueFieldException;
import ru.tinkoff.edu.java.scrapper.exceptions.repository.EmptyResultException;
import ru.tinkoff.edu.java.scrapper.exceptions.repository.ForeignKeyNotExistsException;
import ru.tinkoff.edu.java.scrapper.persistence.entity.LinkData;

import java.util.List;

public interface LinkRepository {
    void add(LinkData link) throws BadEntityException, ForeignKeyNotExistsException, DuplicateUniqueFieldException;
    void remove(long id);
    void remove(String link);
    LinkData getOldestUpdateLink() throws EmptyResultException;
    void updateUpdatedDateLink(long linkId);
    LinkData getByLink(String link) throws EmptyResultException;
    List<LinkData> findAll();
    List<LinkData> getByLinkIds(List<Long> arrChatLink);
}
