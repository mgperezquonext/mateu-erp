package mateu.erp.model.population;

import mateu.erp.model.authentication.Grant;
import mateu.erp.model.authentication.Permission;
import mateu.erp.model.authentication.USER_STATUS;
import mateu.erp.model.authentication.User;
import mateu.erp.model.util.Helper;

import java.util.Date;

/**
 * Created by miguel on 13/9/16.
 */
public class Populator {

    public static void main(String... args) {

        System.out.println("Populating database...");

        Helper.transact((em)->{

            // create super admin permission
            Permission p = new Permission();
            p.setId(1);
            p.setName("Super admin");
            em.persist(p);

            // create user admin
            User u = new User();
            u.setLogin("ADMIN");
            u.setPassword(Helper.md5("1"));
            u.setCreated(new Date());
            u.setStatus(USER_STATUS.ACTIVE);
            u.getGrants().add(new Grant(u, p));
            em.persist(u);

        });

        System.out.println("Database populated.");

    }
}