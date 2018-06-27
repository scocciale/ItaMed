package com.service;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ItaMedserviceImpl
 */
@Stateless
@Local(ItaMedService.class)
public class ItaMedserviceImpl extends BaseService implements ItaMedService {

}
