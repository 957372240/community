package com.hao.community.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphlHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
