package com.jhonystein.pedidex.service;

import com.jhonystein.pedidex.models.Pedido;
import com.jhonystein.pedidex.utils.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PedidoService extends AbstractService<Pedido> {

    @Inject
    private GenericDao<Pedido> dao;
    
    @Override
    protected GenericDao<Pedido> getDao() {
        return dao;
    }
    
}
