package io.mateu.erp.model.importing;

import io.mateu.erp.model.authentication.User;
import io.mateu.erp.model.financials.Actor;
import io.mateu.erp.model.util.Constants;
import io.mateu.ui.mdd.server.util.Helper;
import io.mateu.ui.mdd.server.util.JPATransaction;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Antonia on 26/03/2017.
 */
@Entity
@Getter
@Setter
public class ShuttleDirectAutoImport extends TransferAutoImport {
    private String idTransportista;

    public ShuttleDirectAutoImport()
    {
    }

    public ShuttleDirectAutoImport(String url, String login, String pwd, Actor cus, String idtransportista) {
        this.setLogin(login);
        this.setPassword(pwd);
        this.setUrl(url);
        this.setCustomer(cus);
        this.setIdTransportista(idtransportista);
    }

    public void getBookings(LocalDate from, int days)
    {

        try {
            Helper.transact(new JPATransaction() {
                @Override
                public void run(EntityManager em) throws Throwable {

                    //ir a la web, hacer login y recuperar fichero
                    String xml = "";
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String fdesde = from.format(df);
                    String fhasta = from.plusDays(days).format(df);
                    try {
                        xml = recuperarXml(fdesde,fhasta);
                    } catch (Exception e)
                    {
                        getHistorial().put(LocalDateTime.now(),"Error: " + e.getMessage() + " \n " + e.getStackTrace());
                        e.printStackTrace();
                        return; //Salimos porque sin el fichero no podemos hacer nada
                    }

                    //crear nueva ShuttleDirectImportTask
                    if (xml!=null && xml.length()>0)
                    {
                        User u = em.find(User.class, Constants.IMPORTING_USER_LOGIN);
                        ShuttleDirectImportTask t = new ShuttleDirectImportTask(u,getCustomer(),xml);
                        em.persist(t);
                        getHistorial().put(LocalDateTime.now(),"Tarea creada");
                    }
                    else {
                        System.out.println("Error: el xml esta vacio!");
                        getHistorial().put(LocalDateTime.now(),"Error: el xml esta vacio!");
                        return; //Salimos porque sin el fichero no podemos hacer nada
                    }


                }
            });
        } catch (Throwable e) {
            e.printStackTrace();
        }


     }

    private String recuperarXml(String fini, String ffin) throws Exception {
        HashMap<String, String> params = new HashMap<String,String>();
        params.put("codeSupplierViajesAlameda",this.getLogin());
        params.put("passwordSupplierViajesAlameda",this.getPassword());
        params.put("comboFecha", "-1");
        params.put("fechaInicio", "01/01/2017");
        params.put("fechaFin", "31/12/2017");
        params.put("opcionListado", "0");
        params.put("orderQuery", "fechaTraslado desc");
        params.put("fechaInicioElegida", "01/01/2017");
        params.put("fechaFinElegida", "31/12/2017");
        params.put("Logeando", "1");
        params.put("idTransportista", this.getIdTransportista());
        params.put("idioma", "En");
        params.put("buscarFecha", "calendario");

        String xml = doPost(this.getUrl(), params );
        return xml;

    }

    public static void main(String[] args)
    {
        try {
            String url = "http://www2.shuttledirect.com/supplier/admin/exportarListadoTransportista2Xml.php";
            String login = "VIB";
            String pwd = "f8qu34w8f8aq";
            String idTrans = "476";

            ShuttleDirectAutoImport auto = new ShuttleDirectAutoImport(url,login,pwd,null,idTrans );
            String s = auto.recuperarXml("01/01/2017", "01/12/2017");
            auto.getBookings(LocalDate.now(), 10);
            System.out.println(s);
        } catch (Exception e){
           e.printStackTrace();
        };



    }

}
