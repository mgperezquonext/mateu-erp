package io.mateu.erp.model.product.hotel;

import io.mateu.erp.model.util.XMLSerializable;
import io.mateu.ui.mdd.server.annotations.ValueClass;
import org.jdom2.Element;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Supplement implements XMLSerializable {

    private LocalDate start;
    private LocalDate end;

    private boolean optional;

    private boolean affectedByOffers;

    private String description;

    private SupplementPer per = SupplementPer.PAX;

    private SupplementScope scope = SupplementScope.NIGHT;

    private boolean onRequest;

    private double percent;

    private double value;

    private long providerId;

    private String invoicingKey;

    @ValueClass(RoomType.class)
    private List<String> rooms = new ArrayList<>();

    @ValueClass(BoardType.class)
    private List<String> boards = new ArrayList<>();


    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public boolean isAffectedByOffers() {
        return affectedByOffers;
    }

    public void setAffectedByOffers(boolean affectedByOffers) {
        this.affectedByOffers = affectedByOffers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SupplementPer getPer() {
        return per;
    }

    public void setPer(SupplementPer per) {
        this.per = per;
    }

    public SupplementScope getScope() {
        return scope;
    }

    public void setScope(SupplementScope scope) {
        this.scope = scope;
    }

    public boolean isOnRequest() {
        return onRequest;
    }

    public void setOnRequest(boolean onRequest) {
        this.onRequest = onRequest;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getInvoicingKey() {
        return invoicingKey;
    }

    public void setInvoicingKey(String invoicingKey) {
        this.invoicingKey = invoicingKey;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public List<String> getBoards() {
        return boards;
    }

    public void setBoards(List<String> boards) {
        this.boards = boards;
    }

    public Supplement(Element e) {
        if (e.getAttribute("start") != null) setStart(LocalDate.parse(e.getAttributeValue("start")));
        if (e.getAttribute("end") != null) setEnd(LocalDate.parse(e.getAttributeValue("end")));
        if (e.getAttribute("optional") != null) setOptional(true);
        if (e.getAttribute("affectedByOffers") != null) setAffectedByOffers(true);
        if (e.getAttribute("description") != null) setDescription(e.getAttributeValue("description"));
        if (e.getAttribute("per") != null) setPer(SupplementPer.valueOf(e.getAttributeValue("per")));
        if (e.getAttribute("scope") != null) setScope(SupplementScope.valueOf(e.getAttributeValue("scope")));
        if (e.getAttribute("onRequest") != null) setOnRequest(true);
        if (e.getAttribute("percent") != null) setPercent(Double.parseDouble(e.getAttributeValue("percent")));
        if (e.getAttribute("value") != null) setValue(Double.parseDouble(e.getAttributeValue("value")));
        if (e.getAttribute("providerId") != null) setProviderId(Integer.parseInt(e.getAttributeValue("providerId")));
        if (e.getAttribute("invoicingKey") != null) setInvoicingKey(e.getAttributeValue("invoicingKey"));
        for (Element z : e.getChildren("room")) getRooms().add(z.getAttributeValue("id"));
        for (Element z : e.getChildren("board")) getBoards().add(z.getAttributeValue("id"));
    }

    public Supplement() {
    }

    public Supplement(LocalDate start, LocalDate end, boolean optional, boolean affectedByOffers, String description, SupplementPer per, SupplementScope scope, boolean onRequest, double percent, double value, long providerId, String invoicingKey, List<String> rooms, List<String> boards) {
        this.start = start;
        this.end = end;
        this.optional = optional;
        this.affectedByOffers = affectedByOffers;
        this.description = description;
        this.per = per;
        this.scope = scope;
        this.onRequest = onRequest;
        this.percent = percent;
        this.value = value;
        this.providerId = providerId;
        this.invoicingKey = invoicingKey;
        this.rooms = rooms;
        this.boards = boards;
    }

    @Override
    public Element toXml() {

        Element e = new Element("supplement");

        if (getStart() != null) e.setAttribute("start", getStart().toString());
        if (getEnd() != null) e.setAttribute("end", getEnd().toString());
        if (isOptional()) e.setAttribute("optional", "");
        if (isAffectedByOffers()) e.setAttribute("affectedByOffers", "");
        if (getDescription() != null) e.setAttribute("description", getDescription());
        e.setAttribute("per", "" + getPer());
        e.setAttribute("scope", "" + getScope());
        if (isOnRequest()) e.setAttribute("onRequest", "");
        e.setAttribute("percent", "" + getPercent());
        e.setAttribute("value", "" + getValue());
        e.setAttribute("providerId", "" + getProviderId());
        if (getInvoicingKey() != null) e.setAttribute("invoicingKey", "" + getScope());
        for (String k : getRooms()) e.addContent(new Element("room").setAttribute("id", "" + k));
        for (String k : getBoards()) e.addContent(new Element("board").setAttribute("id", "" + k));

        return e;
    }
}
