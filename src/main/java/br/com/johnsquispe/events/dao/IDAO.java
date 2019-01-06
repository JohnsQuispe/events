package br.com.johnsquispe.events.dao;

import br.com.johnsquispe.events.domain.EntityDomain;

import java.util.List;

public interface IDAO<T extends EntityDomain> {

    public void create(T t);
    public List<T> retrieve();
    public void update(T t);
    public void delete (T t);

}

