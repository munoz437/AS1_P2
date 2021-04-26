package gt.edu.umg.ingenieria.sistemas.segundo_parcial.service;

import gt.edu.umg.ingenieria.sistemas.segundo_parcial.dao.EnterpriseDao;
import gt.edu.umg.ingenieria.sistemas.segundo_parcial.model.EnterpriseEntity;
import java.util.*;

/**
 * 
 */
public class EnterpriseService {

    /**
     * Default constructor
     */
    public EnterpriseService() {
    }

    /**
     * @param id 
     * @return
     */
    public EnterpriseEntity getEnterprise(int id) {
         EnterpriseDao dao = new EnterpriseDao();
         EnterpriseEntity emp=dao.readEnterprise(id);
        return emp;
    }

    /**
     * @param enterprise 
     * @return
     */
    public void createEnterprise(EnterpriseEntity enterprise) {
       EnterpriseDao dao = new EnterpriseDao();
       dao.createEnterprise(enterprise);
    }

    /**
     * @param enterprise 
     * @return
     */
    public void updateEnterprise(EnterpriseEntity enterprise) {
        EnterpriseDao dao = new EnterpriseDao();
       dao.createEnterprise(enterprise);
    }

    /**
     * @param id 
     * @return
     */
    public void deleteEnterprise(int id) {
        EnterpriseDao dao = new EnterpriseDao();
        dao.deleteEnterprise(id);
        
    }

}