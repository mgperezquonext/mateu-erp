package io.mateu.erp.client.product;

import io.mateu.ui.core.client.app.AbstractArea;
import io.mateu.ui.core.client.app.AbstractModule;
import io.mateu.ui.core.client.app.MateuUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by miguel on 3/1/17.
 */
public class ProductArea extends AbstractArea {

    public ProductArea() {
        super("Product");
    }

    @Override
    public List<AbstractModule> getModules() {
        List<AbstractModule> l = new ArrayList<>();
        l.add(new HotelModule());
        if (!MateuUI.getApp().getName().toLowerCase().contains("quoon")) l.add(new TransferModule());
        if (!MateuUI.getApp().getName().toLowerCase().contains("quoon")) l.add(new GenericModule());
        return l;
    }
}
