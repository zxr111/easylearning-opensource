package com.easylearning.elweb.dao;

public interface DefaultDAO<Entity> {

    int create(Entity entity);

    int update(Entity entity);

    Entity findById(Object id);

    int remove(Entity entity);
}
