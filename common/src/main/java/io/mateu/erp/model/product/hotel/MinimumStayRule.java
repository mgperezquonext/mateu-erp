package io.mateu.erp.model.product.hotel;

import io.mateu.erp.model.util.XMLSerializable;
import io.mateu.ui.mdd.server.annotations.ValueClass;
import org.jdom2.Element;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguel on 1/10/16.
 */
public class MinimumStayRule implements XMLSerializable {

    private LocalDate start;
    private LocalDate end;

    private int nights;

    private boolean onRequest;

    private double supplementPercent;

    private double supplementValue;

    private SupplementPer per;

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

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public boolean isOnRequest() {
        return onRequest;
    }

    public void setOnRequest(boolean onRequest) {
        this.onRequest = onRequest;
    }

    public double getSupplementPercent() {
        return supplementPercent;
    }

    public void setSupplementPercent(double supplementPercent) {
        this.supplementPercent = supplementPercent;
    }

    public double getSupplementValue() {
        return supplementValue;
    }

    public void setSupplementValue(double supplementValue) {
        this.supplementValue = supplementValue;
    }

    public SupplementPer getPer() {
        return per;
    }

    public void setPer(SupplementPer per) {
        this.per = per;
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

    public MinimumStayRule(Element e) {

        if (e.getAttribute("start") != null) setStart(LocalDate.parse(e.getAttributeValue("start")));
        if (e.getAttribute("end") != null) setEnd(LocalDate.parse(e.getAttributeValue("end")));
        if (e.getAttribute("nights") != null) setNights(Integer.parseInt(e.getAttributeValue("nights")));
        if (e.getAttribute("onRequest") != null) setOnRequest(true);
        if (e.getAttribute("supplementPercent") != null) setSupplementPercent(Double.parseDouble(e.getAttributeValue("supplementPercent")));
        if (e.getAttribute("supplementValue") != null) setSupplementValue(Double.parseDouble(e.getAttributeValue("supplementValue")));
        if (e.getAttribute("per") != null) setPer(SupplementPer.valueOf(e.getAttributeValue("per")));
        for (Element z : e.getChildren("room")) getRooms().add(z.getAttributeValue("id"));
        for (Element z : e.getChildren("board")) getBoards().add(z.getAttributeValue("id"));

    }

    public MinimumStayRule() {
    }

    public MinimumStayRule(LocalDate start, LocalDate end, int nights, boolean onRequest, double supplementPercent, double supplementValue, SupplementPer per, List<String> rooms, List<String> boards) {
        this.start = start;
        this.end = end;
        this.nights = nights;
        this.onRequest = onRequest;
        this.supplementPercent = supplementPercent;
        this.supplementValue = supplementValue;
        this.per = per;
        this.rooms = rooms;
        this.boards = boards;
    }

    @Override
    public Element toXml() {
        Element e = new Element("rule");

        if (getStart() != null) e.setAttribute("start", getStart().toString());
        if (getEnd() != null) e.setAttribute("end", getEnd().toString());
        e.setAttribute("nights", "" + getNights());
        if (isOnRequest()) e.setAttribute("onRequest", "");
        e.setAttribute("supplementPercent", "" + getSupplementPercent());
        e.setAttribute("supplementValue", "" + getSupplementValue());
        e.setAttribute("per", "" + getPer());
        for (String k : getRooms()) e.addContent(new Element("room").setAttribute("id", "" + k));
        for (String k : getBoards()) e.addContent(new Element("board").setAttribute("id", "" + k));

        return e;
    }
}
