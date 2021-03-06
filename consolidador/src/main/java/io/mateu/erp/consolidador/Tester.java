package io.mateu.erp.consolidador;

import io.mateu.erp.dispo.interfaces.auth.IAuthToken;
import io.mateu.erp.dispo.interfaces.portfolio.IResource;
import org.easytravelapi.hotel.Occupancy;

import java.util.Arrays;
import java.util.List;

public class Tester {

    public static void main(String... args) {

        final long t0 = System.nanoTime();

        new Consolidador(new ModeloConsolidador() {


            @Override
            public IAuthToken getAuthToken(String token) {
                return null;
            }

            @Override
            public List<IResource> getResources(List<String> resorts) {
                return null;
            }


        }).procesar(new DispoRQ(
                "iuweigdiwegdiegwd"
                , Arrays.asList("")
                ,20180601
                , 20180615
                , Arrays.asList(new Occupancy())
                , false

        ), (rs) -> {

            System.out.println("rs = " + rs);

            System.out.println("fin en " + (System.nanoTime() - t0) + " ns.");

            System.exit(0);

        });


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("fin por timeout.");

    }

}
