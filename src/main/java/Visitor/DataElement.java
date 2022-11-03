package Visitor;

import java.util.TreeMap;

public interface DataElement {
    TreeMap accept(DataElementVisitor vis);
}
