package main.src.main.java.detecting;

import javax.lang.model.element.Element;
import java.awt.print.Book;
import java.util.Collection;

public class SwitchStatement {

    long computeWeight(Element elem) {
        if (elem instanceof Book) {
            return ((Book) elem.getBookWeight();
        } else {
            return ((Collection) elem).getTotalWeight();
        }
    }

}
